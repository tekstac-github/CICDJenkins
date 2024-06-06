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
                        classpath="$projectLocation/Test/bin/*:$projectLocation/Test/lib/*"
                        echo $classpath
                        java -cp "$classpath" org.testng.TestNG "$projectLocation/Test/testng.xml"
                    '''
                    echo 'Selenium tests completed.'
                }
            }
        }
    }

 
}
