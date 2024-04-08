> startup kubernets
    minikube start

> Criação do cluster
k3d cluster create meucluster --servers 3 -- agents 3 -p "30000:30000@loadbalancer"

> Realizar o deploy
    kubectl apply -f k8s/deploy.yaml

> descobrir versão e spec
    kubectl api-resources 

> roolback
    kubectl get replicaset
    kubectl rollout history deployment
    kubectl rollout undo deployment orders