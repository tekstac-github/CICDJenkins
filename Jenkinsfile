pipeline {
    agent any
 
    stages {
        stage('Test') {
            steps {
                script {
                    echo 'Running Selenium tests...'
                    sh '''#!/bin/bash
                        workspace=$WORKSPACE
                        projectLocation=${workspace}/CICDJenkins/Test
                        echo "Project Location: $projectLocation"
                        pushd "$projectLocation"
                        echo "Classpath: $projectLocation/bin:$projectLocation/lib/*"
                        classpath="$projectLocation/bin:$projectLocation/lib/*"
                        java -cp $classpath org.testng.TestNG testng.xml
                    '''
                    echo 'Selenium tests completed.'
                }
            }
        }
    }

 
}
