pipeline {
    agent any

    stages {
        stage('clone') {
            steps {
                git 'https://github.com/amantiwari8861/_00_JenkinsSeleniumIntro.git'
            }
        }

        stage('Deploy code') {
            steps {
                step {
                    sh '''
                        sudo cp -r * /var/www/html/
                        sudo systemctl restart nginx
                    '''
                }
            }
        }
    }
}