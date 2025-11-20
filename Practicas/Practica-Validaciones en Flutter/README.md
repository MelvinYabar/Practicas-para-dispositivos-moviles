

## 🧩 ¿Qué hace la app?

La app tiene dos partes principales:

### 1. Pantalla de Login
- Pide **correo** y **contraseña**.
- Valida que los campos no estén vacíos.
- Si el formulario es válido, te lleva a la pantalla de usuarios.
- El email que ingresas se muestra luego en la pantalla principal como referencia.
- El botón de **“Crear cuenta”** solo muestra un mensaje tipo:  
  > “Función de registro no implementada”  
  (está ahí más como placeholder que como funcionalidad real).

### 2. Gestión de Usuarios
Desde la pantalla principal puedes:

- Ver una **lista de usuarios** registrados.
- Ver un **contador** con el total de usuarios.
- Activar un **filtro** para mostrar solo los usuarios activos.
- **Agregar** nuevos usuarios con:
  - Nombre  
  - Género  
  - Edad  
  - Correo  
  - Estado (activo / inactivo)
- **Editar** un usuario existente.
- **Eliminar** usuarios de la lista.
- Cerrar sesión y volver a la pantalla de login.

Todo se guarda **en memoria**, no hay base de datos ni API. Si cierras la app, se pierde la info (es app de práctica, no “producción” todavía).

---

## ⚙️ ¿Cómo está organizado el código?

A grandes rasgos:

- `lib/models/user.dart`  
  Define el modelo `User` con los campos: `nombre`, `genero`, `edad`, `correo` y `activo`.

- `lib/viewmodels/user_view_model.dart`  
  Es el ViewModel que:
  - Mantiene la lista de usuarios.
  - Ofrece métodos para agregar, editar y eliminar.
  - Expone también una lista filtrada de usuarios activos.
  - Extiende de `ChangeNotifier` para poder llamar a `notifyListeners()` y que la UI se actualice.

- `lib/views/login_screen.dart`  
  Pantalla de login con formulario básico. Si el login es válido, navega a `UserListScreen`.

- `lib/views/user_list_screen.dart`  
  Muestra la lista de usuarios, el filtro de activos, el contador, el botón de agregar y la opción de cerrar sesión.

- `lib/views/user_form_screen.dart`  
  Formulario para crear o editar un usuario, con validaciones sencillas (por ejemplo, que los campos obligatorios no vayan vacíos).

- `lib/main.dart`  
  Configura la app, envuelve todo en un `ChangeNotifierProvider` de `UserViewModel` y arranca en `LoginScreen`.

En resumen, la idea es separar un poco la lógica (ViewModel) de la interfaz (Views) y usar `Provider` en lugar de depender solo de `setState()` por todos lados.




Este proyecto está pensado como práctica de:

- Formularios en Flutter.
- Navegación entre pantallas.
- Manejo de estado con `ChangeNotifier` + `Provider`.
- Separación mínima entre modelo, ViewModel y vistas.

- Autor - Melvin Yabar Carazas
