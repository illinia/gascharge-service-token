# gascharge-service-token

토큰 서비스 관련 모듈

* token 서비스 클래스

*domain-token 의존, 독립적으로 실행 불가능*

로컬, 원격 메이븐 레포지토리
```groovy
implementation 'com.gascharge.taemin:gascharge-service-token:0.0.1-SNAPSHOT'
```

멀티 모듈 프로젝트
```groovy
// settings.gradle
includeProject("token", "service")
```
```groovy
// build.gradle
implementation project(":gascharge-service-token")
```