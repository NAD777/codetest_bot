FROM python:3.9.16

RUN pip install flask pyyaml requests prometheus_flask_exporter

WORKDIR /app

ADD ./orchestrator/orchestrator/app.py .
ADD ./orchestrator/orchestrator/test_runner.py .
ADD ./configs/ ./configs/