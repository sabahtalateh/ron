package com.github.sabahtalateh.ron.services

import com.github.sabahtalateh.ron.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
