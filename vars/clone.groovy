def call( String Giturl, String Gitbranch){
  git url: "${Giturl}", branch: "${Gitbranch}"
  echo "Code cloning Successfull"
}
