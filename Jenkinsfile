pipeline {
    agent any
 
    stages {
        stage('Test') {
            steps {
                script {
                    echo 'Running Selenium tests...'
                    sh '''#!/bin/bash
                        set workspace = env.WORKSPACE
                        projectLocation=${workspace}/Test
                        echo Project Location: $projectLocation
                        pushd "$projectLocation"
                        echo Classpath: $projectLocation/bin;$projectLocation/lib/*
                        set "classpath=$projectLocation/bin;$projectLocation/lib/*"
                        java -cp $classpath org.testng.TestNG testng.xml
                    '''
                    echo 'Selenium tests completed.'
                }
            }
        }
    }

 
}
