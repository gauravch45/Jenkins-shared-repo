def call( String Back_img, String Front_img){
  sh "docker build -t "${Back_img}" ./backend"
  sh "docker build -t "${Front_img}" ./frontend"
  echo "The build is Successfull"
}
