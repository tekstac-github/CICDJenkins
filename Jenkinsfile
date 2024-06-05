pipeline {
    agent any
 
    stages {
        stage('Test') {
            steps {
                script {
                    echo 'Running Selenium tests...'
                    sh '''#!/bin/bash
                        workspace=$WORKSPACE
                        projectLocation=${workspace}/CICDJenkins
                        echo "Project Location: $projectLocation"
                        cd "$projectLocation"
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
