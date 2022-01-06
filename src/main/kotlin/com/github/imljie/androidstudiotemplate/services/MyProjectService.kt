package com.github.imljie.androidstudiotemplate.services

import com.intellij.openapi.project.Project
import com.github.imljie.androidstudiotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
