package com.proyecto.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "proyectoweb-ebfb3.appspot.com";

    //Esta es la ruta básica de este proyecto
    final String rutaSuperiorStorage = "proyectoweb";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "proyectoweb-ebfb3-firebase-adminsdk-lix18-a8bc220b7d.json";
}
