# 🔐 Llaves Favoritas – Taller 7

Este proyecto implementa una API REST en Java con Spring Boot para gestionar **llaves favoritas**: tipos de contacto frecuentes a los que se transfiere dinero regularmente (correo, celular, etc.).

> 🚀 Proyecto académico – Taller 7 de Arquitectura y Desarrollo de Software

---

## 📌 Funcionalidades (Backlog)

| Código | Funcionalidad                             |
|--------|-------------------------------------------|
| CU001  | ✅ Agregar llave favorita                 |
| CU002  | ✅ Listar llaves favoritas                |
| CU003  | ✅ Validar si una llave ya fue guardada   |
| CU004  | ✅ Editar el alias de una llave favorita  |
| CU005  | ✅ Eliminar una llave favorita            |

---

## 🧱 Tecnologías usadas

- 🧑‍💻 Java 21
- 🌐 Spring Boot 3.5.0
- 🧩 SQLite 3
- 🎨 JavaFX (para interfaz básica)
- 🧪 JUnit + Mockito (pruebas unitarias)
- ☕ Maven

---

## 🗂️ Estructura del proyecto (Arquitectura limpia)

```
favoritos/
├── domain/
│   └── LlaveFavorita.java
│   └── LlaveFavoritaRepository.java
├── infrastructure/
│   └── LlaveFavoritaJpaRepository.java
│   └── LlaveFavoritaRepositoryImpl.java
├── service/
│   └── LlaveFavoritaService.java
├── controller/
│   └── LlaveFavoritaController.java
├── ui/
│   └── MainApp.java (JavaFX)
└── test/
    └── LlaveFavoritaServiceTest.java
```

---

## ⚙️ Configuración

### 🧩 Dependencias clave (`pom.xml`)

```xml
<dependency>Spring Boot Starter Web</dependency>
<dependency>Spring Data JPA</dependency>
<dependency>SQLite JDBC</dependency>
<dependency>JavaFX Controls</dependency>
<dependency>JUnit + Mockito</dependency>
```

---

## 🚀 Ejecución del backend

1. Clona el repositorio:
```bash
git clone https://github.com/tu-usuario/favoritos.git
cd favoritos
```

2. Ejecuta la app:
```bash
./mvnw spring-boot:run
```

La API correrá en: `http://localhost:8080/api/llaves`

---

## 🧪 Endpoints disponibles

### 📬 Agregar una llave

```http
POST /api/llaves
{
  "tipo": "correo",
  "valor": "ejemplo@correo.com",
  "alias": "Mi Contacto"
}
```

### 📋 Listar todas

```http
GET /api/llaves
```

### 🔍 Validar existencia

```http
GET /api/llaves/validar/ejemplo@correo.com
```

### ✏️ Editar alias

```http
PUT /api/llaves/1/alias
"Alias nuevo"
```

### 🗑️ Eliminar

```http
DELETE /api/llaves/1
```

---

## 🧪 Pruebas unitarias

Ejecuta las pruebas con:

```bash
./mvnw test
```

Se utiliza `Mockito` para simular el repositorio y validar cada caso de uso.

---

## 🖥️ Interfaz gráfica (JavaFX)

Ejecuta la UI desde la clase:

```
com.example.favoritos.ui.MainApp
```

Muestra una lista de llaves favoritas y permite agregar/eliminar.

---

## 💡 Notas finales

- El proyecto está organizado por capas limpias: dominio, aplicación, infraestructura y presentación.
- Se siguen principios SOLID y se usa Git Flow como convención de ramas.

---
