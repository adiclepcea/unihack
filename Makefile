
.PHONY: run-java run-mysql stop-mysql build run stop help

help:
	@echo "help       show this help"
	@echo "run-java   run the spring project"
	@echo "run-mysql  run the mysql docker"
	@echo "stop-mysql stop the mysql docker"
	@echo "build      build the docker image for spring"
	@echo "run        run the docker-compose solution"
	@echo "stop       stop the solution"

run-java:
	gradle bootRun

run-mysql:
	docker run --name whale-mysql -e MYSQL_ROOT_PASSWORD=secret123 -e MYSQL_USER=whale -e MYSQL_PASSWORD=blue-whale -e MYSQL_DATABASE=mobydick -p 3306:3306 -d mysql:5.7

stop-mysql:
	docker stop whale-mysql || true && docker rm whale-mysql || true

build:
	docker rmi whale | true
	gradle build
	cp build/libs/unihack-0.0.1-SNAPSHOT.jar docker/
	cd docker && docker-compose build whale && cd ..

run:
	cd docker && docker-compose up -d && cd ..

stop:
	cd docker && docker-compose down && cd ..
