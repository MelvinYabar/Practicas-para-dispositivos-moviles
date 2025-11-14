# Gestión de Usuarios (Flutter)

Este proyecto es una pequeña aplicación hecha en **Flutter** que permite gestionar una lista de usuarios de forma sencilla. La idea es tener algo simple pero ordenado, sin complicarse demasiado, pero que igual se pueda mostrar como algo “bien hecho”.

---

## 🧩 ¿Qué hace la app?

La app permite:

- Agregar usuarios con:
  - Nombre  
  - Género  
  - Edad  
  - Correo  
  - Estado **activo / inactivo**
- Ver todos los usuarios en una lista.
- Editar un usuario existente.
- Eliminar usuarios que ya no se necesiten.
- Activar un **filtro** para ver solo los usuarios activos.

---

## ⚙️ ¿Cómo funciona por dentro? (a grandes rasgos)

Sin entrar muy técnico, la app está dividida en tres partes:

- `models/user.dart`  
  Define el modelo `User` con los campos básicos (nombre, genero, edad, correo, activo).

- `viewmodels/user_view_model.dart`  
  Es el “cerebro” que maneja la lista de usuarios: agregar, editar, eliminar y filtrar.  
  Usa `ChangeNotifier` para que la interfaz se actualice cuando cambian los datos.

- `views/`  
  - `user_list_screen.dart`: pantalla principal con la lista de usuarios, el botón para agregar y el filtro de activos.  
  - `user_form_screen.dart`: formulario para crear o editar un usuario, con validaciones básicas.

Todo esto se conecta usando el paquete **provider**, que se encarga de compartir el estado (`UserViewModel`) con las pantallas.

---

## 🛠️ Tecnologías usadas

- **Flutter**
- **Dart**
- **Provider**
- Widgets de **Material Design**

---

## 📦 Requisitos para ejecutar el proyecto

- Flutter SDK
- Android Studio, VS Code o similar
- Un emulador o dispositivo real

---

## ▶️ Cómo correr la aplicación

```bash
flutter pub get
flutter run
```

---

Si se quisiera mejorar este proyecto, podría agregarse persistencia (SQLite, Hive o API) y validaciones más avanzadas.
