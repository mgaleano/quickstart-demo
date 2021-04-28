# Create git pre-commit hook
PRE_COMMIT_FILE=".git/hooks/pre-commit"
if [ ! -f $PRE_COMMIT_FILE ]; then
  echo "Creating git pre-commit hook..."
  touch $PRE_COMMIT_FILE
  echo "#!/bin/sh" >>$PRE_COMMIT_FILE
  echo "exec sh bin/run-checkstyle.sh" >>$PRE_COMMIT_FILE
  chmod +x $PRE_COMMIT_FILE
fi

# Create aut-local.properties
AUT_LOCAL_FILE="src/test/resources/aut-local.properties"
if [ ! -f $AUT_LOCAL_FILE ]; then
  echo "Creating aut-local.properties..."
  touch $AUT_LOCAL_FILE
  echo "# Insert your local configuration in this file" >>$AUT_LOCAL_FILE
fi

# Download dependencies using settings.xml in .m2
MAVEN_FOLDER="${HOME}/.m2"
SETTINGS_FILE="${MAVEN_FOLDER}/settings.xml"
if [ ! -f $SETTINGS_FILE ]; then
    if [ ! -d $MAVEN_FOLDER ]; then
      mkdir $MAVEN_FOLDER
      echo "Folder .m2 created."
    fi
    read -p "Enter your github user: " GITHUB_USER
    read -p "Enter your personal access token: " GITHUB_TOKEN
    if [[ $GITHUB_USER != "" && $GITHUB_TOKEN != "" ]]; then
      cp settings.xml $SETTINGS_FILE
      sed -i -e "s/\${USER_GITHUB}/$GITHUB_USER/g" $SETTINGS_FILE
      sed -i -e "s/\${TOKEN_GITHUB}/$GITHUB_TOKEN/g" $SETTINGS_FILE
      rm "${SETTINGS_FILE}-e"
    else
      echo "Please enter github user and personal access token."
    fi
fi

mvn clean install -DskipTests