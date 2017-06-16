export JENKINS_HOME="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
echo Running from $JENKINS_HOME
java -Djenkins.install.runsetupWizard=false -jar jenkins-blueocean.jar --daemon --controlPort=10123 --logfile=$JENKINS_HOME/jenkins.log
