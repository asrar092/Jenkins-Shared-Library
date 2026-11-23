def call(String ProjectName, String ImagesTag, String DockerhubUser){
  sh "docker build -t "${DockerHubUser}"/"${ProjectName}":"${ImagesTag}" ."
}
