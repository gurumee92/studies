# 시그널: 분산 추적, 메트릭, 로그

## 요구 사항

* 도커

윈도우 환경 도커 설치 명령어
```posh
winget install -e --id Docker.DockerDesktop
```

## 실행

```posh
docker compose up
```

## 확인

### grocery-store 요청하기
```posh
curl -Uri "http://localhost:5000/healthcheck"
```


### inventory 요청하기
```posh
curl -Uri "http://localhost:5001/healthcheck"
```