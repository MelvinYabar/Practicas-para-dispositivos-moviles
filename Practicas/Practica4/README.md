# Práctica 4 – Comunicación entre Actividades

Este proyecto contiene dos aplicaciones desarrolladas en Kotlin utilizando Android Studio.  
El objetivo es practicar la comunicación entre actividades, el uso de `Intent`, `Serializable`, `registerForActivityResult`, y la persistencia de datos con `onSaveInstanceState`.

## Ejercicio 1: Editor de perfil con confirmación

### Descripción
Aplicación que permite llenar un perfil de usuario con los campos:
- Nombre  
- Edad  
- Ciudad  
- Correo electrónico  

Los datos se envían a una segunda actividad para mostrar un resumen.  
El usuario puede confirmar la información o regresar a editar.

### Flujo
1. En **FormularioActivity**, el usuario ingresa sus datos y presiona el botón **Continuar**.  
2. Los datos se envían a **ResumenActivity** usando un objeto `Usuario` que implementa `Serializable`.  
3. En **ResumenActivity**:
   - El botón **Confirmar** devuelve a la actividad anterior mostrando un mensaje *"Perfil guardado correctamente"*.  
   - El botón **Volver a editar** regresa a la actividad anterior para modificar los datos.  
4. Se asegura que los datos escritos no se pierdan al rotar la pantalla con `onSaveInstanceState`.

---

## Ejercicio 2: Editor de nota rápida

### Descripción
Aplicación que permite al usuario escribir una nota y enviarla a otra actividad para decidir entre compartirla o editarla nuevamente.

### Flujo
1. En **EditorActivity**, el usuario escribe la nota en un `EditText` y presiona el botón **Compartir**.  
2. La nota se envía a **OpcionesActivity** mediante un `Intent`.  
3. En **OpcionesActivity**:
   - El botón **Compartir por correo** muestra un mensaje *"Compartido por correo"*.  
   - El botón **Editar de nuevo** devuelve la nota a la primera actividad para seguir editando.  
4. El contenido de la nota se guarda al rotar la pantalla usando `onSaveInstanceState`.

---

## Requisitos
- Android Studio (versión recomendada: Giraffe o superior).  
- Kotlin como lenguaje principal.  
- No se utilizaron Fragments, únicamente Activities.  

---

## Ejecución del proyecto
1. Clonar o descargar este repositorio en su equipo.  
2. Abrir el proyecto en **Android Studio**.  
3. Compilar y ejecutar en un emulador o dispositivo físico con Android.  
4. Seleccionar la actividad correspondiente para probar cada ejercicio.  

---

## Autor
Melvin Yabar Carazas  
Práctica 4 – Curso de Programación de Dispositivos Móviles  
Universidad La Salle – 2025
