pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
        
    }
    stages{
        stage('Build Maven'){
            steps
            {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cbbloxxxindore/empmongoapp.git']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
                    steps{
                        script{
                            sh 'docker build -t abhijeetmishu/employee_mongoapp .'
                        }
                    }
                }
                stage('Push image to Hub'){
                            steps{
                                script{
                withCredentials([string(credentialsId: 'dockerh-pwd', variable: 'dockerhubpwd')]) {
                                   sh 'docker login -u abhijeetmishu -p ${dockerhubpwd}'

                }
                                   sh 'docker push abhijeetmishu/employee_mongoapp'
                                }
                            }
                        }
    }
}
