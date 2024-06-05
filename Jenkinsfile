pipeline {
    agent any
 
    stages {
        stage('Test') {
            steps {
                script {
                    echo 'Running Selenium tests...'
                    sh '''#!/bin/bash
                        workspace=$WORKSPACE
                        projectLocation=${workspace}
                        echo "Project Location: $projectLocation"
                        cd "$projectLocation"
                        ls -a
                        echo "Classpath: $projectLocation/Test/bin:$projectLocation/Test/lib/*"
                        classpath="$projectLocation/Test/bin:$projectLocation/Test/lib/*"
                        java -cp $classpath org.testng.TestNG $projectLocation/Test/testng.xml
                    '''
                    echo 'Selenium tests completed.'
                }
            }
        }
    }

 
}
