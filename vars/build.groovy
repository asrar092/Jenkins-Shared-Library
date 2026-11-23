def call(String ProjectName, String ImagesTag, String DockerhubUser){
  sh "docker build -t ${DockerhubUser}/${ProjectName}:${ImagesTag} ."
}
