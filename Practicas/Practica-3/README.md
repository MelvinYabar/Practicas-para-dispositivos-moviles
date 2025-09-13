# Práctica 3 — Aplicaciones básicas Android (Kotlin)

**Autor:** melvin yabar carazas  
**Curso:** Programación para dispositivos móviles (PDM)  
**Fecha:** 12/09/2025

## Descripción general
Este repositorio contiene **dos mini-aplicaciones** desarrolladas en **Kotlin** con **Android Studio** para practicar interacción con vistas, manejo de eventos y reproducción de audio.

---

## Ejercicio 1 — Imagen con interacción y mensaje
**Funcionalidad**
- Muestra una **imagen** y un **texto descriptivo**.
- Al **tocar** la imagen, aparece un **Toast** con un mensaje personalizado.

**Puntos clave**
- `activity_main.xml` con `ImageView` + `TextView`.
- `setOnClickListener { /* Toast */ }` en la imagen.

**Archivos (ejemplo)**
- `app/src/main/res/drawable/ic_alert.png`
- `app/src/main/res/layout/activity_main.xml`
- `app/src/main/java/.../MainActivity.kt`

---

## Ejercicio 2 — Reproductor de audio simple
**Funcionalidad**
- Reproducción de un **audio local** desde `res/raw/`.
- Botones: **Reproducir**, **Pausar** y **Detener**.

**Puntos clave**
- Archivo en `app/src/main/res/raw/audio_demo.mp3` (agregarlo al proyecto).
- Control con `MediaPlayer` (`start()`, `pause()`, `stop()` + `prepare()` o recrear).
- Liberar con `mediaPlayer.release()` en `onDestroy()`.

**Archivos (ejemplo)**
- `app/src/main/res/raw/audio_demo.mp3`
- `app/src/main/res/layout/activity_main.xml`
- `app/src/main/java/.../MainActivity.kt`

---

## Requisitos
- Android Studio (Giraffe o superior).
- **Compile SDK:** 34 recomendado.
- **Kotlin** habilitado.

---

## Cómo ejecutar
1. Abrir el proyecto en **Android Studio** (`File > Open`).
2. Esperar la **sincronización de Gradle**.
3. Conectar un dispositivo físico o iniciar un **emulador**.
4. Presionar **Run** (▶) y probar:
   - **Ejercicio 1:** tocar la imagen para ver el **Toast**.
   - **Ejercicio 2:** usar los botones para controlar el audio.

---

