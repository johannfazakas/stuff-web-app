# sd-web-app
Web App for Social Diary

## Build & Run

### Local development
```shell
./gradlew clean run --continuous
```

### Build docker image
- [ ] have Dockerfile handle webpack distribution creation
```shell
./gradlew clean browserProductionWebpack
docker image build -t sd-web-app:latest .
```

### Push docker image to ECR
```shell
docker tag sd-web-app:latest 668485322428.dkr.ecr.eu-central-1.amazonaws.com/sd-web-app:latest
docker image push 668485322428.dkr.ecr.eu-central-1.amazonaws.com/sd-web-app:latest
```
