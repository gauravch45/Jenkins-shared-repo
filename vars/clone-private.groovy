def call( String Giturl, String Gitbranch, String Gitcred){
  git branch: "${Gitbranch}" , credentialsId: "${Gitcred}", url: "${Giturl}"
  echo "Code cloning Successfull"
}
