# 빌드 스테이지: 소스코드 컴파일 및 JAR 산출물 생성
FROM gradle:jdk21-graal-jammy AS builder
WORKDIR /workspace
COPY build.gradle .
COPY settings.gradle .
RUN gradle wrapper
RUN ./gradlew dependencies
COPY src src
RUN ./gradlew build -x test

# 실행 스테이지: 빌드 결과물을 복사해 경량화된 실행 환경 구성
FROM container-registry.oracle.com/graalvm/jdk:21
WORKDIR /workspace
COPY --from=builder /workspace/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
