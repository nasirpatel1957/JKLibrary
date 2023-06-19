def call(String ImageName, String AccountID, String RegionName) {
    sh """
        docker build -t ${ImageName} .
        docker tag ${ImageName}:latest ${AccountID}.dkr.ecr.${RegionName}.amazonaws.com/${ImageName}:latest
    """
}