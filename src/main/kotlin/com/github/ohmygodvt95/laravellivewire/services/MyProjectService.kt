package com.github.ohmygodvt95.laravellivewire.services

import com.intellij.openapi.project.Project
import com.github.ohmygodvt95.laravellivewire.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
