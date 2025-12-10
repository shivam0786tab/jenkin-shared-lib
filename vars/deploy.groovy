def call(String repoName,String imageTag){
  withCredentials([usernamePassword(credentialsId: 'docker-hub-cred' , usernameVariable:'DOCKER_USER' , passwordVariable:'DOCKER_PASS')]){
      sh "echo ${DOCKER_PASS} | docker login -u ${DOCKER_USER} --password-stdin"
      sh "docker push ${env.DOCKER_USER}/${repoName}:${imageTag}"
  }
}
