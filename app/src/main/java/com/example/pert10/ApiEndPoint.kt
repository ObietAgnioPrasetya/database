package com.example.pert10

class ApiEndPoint {
    companion object {

        private val SERVER  = "http://192.168.100.27/lol/"
        val CREATE   = SERVER + "create_fakultas.php"
        val READ     = SERVER + "read_fakultas.php"
        val UPDATE   = SERVER + "fakultas_update.php"
        val DELETE   = SERVER + "fakultas_delete.php"
    }
}