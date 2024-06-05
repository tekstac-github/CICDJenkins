pipeline {
    agent any
 
    stages {
        stage('Test') {
            steps {
                script {
                    echo 'Running Selenium tests...'
                    sh '''#!/bin/bash
                        workspace=$WORKSPACE
                        projectLocation=${workspace}/Test
                        echo "Project Location: $projectLocation"
                        pushd "$projectLocation"
                        echo "Classpath: Test/bin:Test/lib/*"
                        classpath="Test/bin:Test/lib/*"
                        java -cp $classpath org.testng.TestNG testng.xml
                    '''
                    echo 'Selenium tests completed.'
                }
            }
        }
    }

 
}
