pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/amantiwari8861/_00_JenkinsSeleniumIntro.git'
            }
        }

        stage('Deploy Code') {
            steps {
                sh '''
                    sudo cp -r * /var/www/html/
                    sudo systemctl restart nginx
                '''
            }
        }
    }
}