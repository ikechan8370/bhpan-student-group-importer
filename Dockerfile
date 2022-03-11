FROM anapsix/alpine-java:8_server-jre_unlimited

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /buaa

WORKDIR /buaa

ADD ./target/bhpan-connect-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java", "-Dlog4j2.formatMsgNoLookups=true", "-Djava.security.egd=file:/dev/./urandom", "-jar", "bhpan-connect-0.0.1-SNAPSHOT.jar"]
