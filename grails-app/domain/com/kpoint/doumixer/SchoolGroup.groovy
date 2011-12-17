package com.kpoint.doumixer

class SchoolGroup {

    int id
    String level

    static hasOne = [schedule:Schedule]
    static hasMany = [events: Event]
    static constraints = {
        level(inList: ["Elementary", "Preintermediate", "Intermediate", "Upper Intermediate", "Advanced"])
    }
}
