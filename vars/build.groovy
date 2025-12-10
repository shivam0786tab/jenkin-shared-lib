def call(String dockerUser, String repoName, String tag){
  sh "docker build -t ${dockerUser}/${repoName}:${tag} ."
}
