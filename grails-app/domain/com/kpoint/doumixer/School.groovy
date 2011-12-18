package com.kpoint.doumixer

class School {
    int id
    String name
    String schoolType
    Double latitude
    Double longitude
    String address
    String phoneNumber
    String email
    String region



    static hasMany = [groups: SchoolGroup]

    static constraints = {
        name (blank: false, unique: true)
        address (blank:  false)
        email (email:true, blank: false)
        schoolType(inList: ["English", "Box", "Makrame", "German", "Auto School"], maxSize: 25)
        region (inList: ["Darnytsia", "Desna", "Dnipro", "Holosiiv", "Obolon", "Pechersk",
        "Podil", "Shevchenko", "Solomyanka", "Svyatoshyn",'Troeshina'], maxSize: 25)
    }
}
