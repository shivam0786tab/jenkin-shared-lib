def call(String url, String branch){
  echo "This is checking out the code"
  git url: "${url}", branch: "${branch}"
  echo "Code cloning success!!"
}
