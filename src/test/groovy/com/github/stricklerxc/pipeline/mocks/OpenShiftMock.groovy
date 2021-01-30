package com.github.stricklerxc.pipeline.mocks

class OpenShiftMock {
    String clusterUrl
    String project

    OpenShiftMock() {
        this.clusterUrl = "default.cluster.com"
        this.project = "default"
    }

    def cluster() {
        return clusterUrl
    }

    def project() {
        return project
    }

    def withCluster(String clusterId, Closure closure) {
        if (clusterId != null) {
            this.clusterUrl = "${clusterId}.cluster.com"
        }

        closure()
    }

    def withProject(String projectName, Closure closure) {
        if (projectName != null) {
            this.project = projectName
        }

        closure()
    }
}
