USE tienda;
SELECT nombre FROM producto;
SELECT nombre, precio FROM producto;
SELECT * FROM producto;
SELECT nombre, precio AS Euros, precio AS USD FROM producto; 
SELECT nombre AS 'nom de producto', precio AS euros, precio AS dòlars FROM producto;
SELECT UPPER(nombre), precio FROM producto;
SELECT LOWER(nombre), precio FROM producto;
SELECT nombre, UPPER(SUBSTR(nombre,1,2)) FROM fabricante;
SELECT nombre, ROUND(precio) FROM producto;
SELECT nombre, TRUNCATE(precio, 0) FROM producto;
SELECT codigo_fabricante FROM producto;
SELECT distinct codigo_fabricante FROM producto;
SELECT nombre FROM fabricante ORDER BY nombre ASC;
SELECT nombre FROM fabricante ORDER BY nombre DESC;
SELECT nombre, precio FROM producto ORDER BY nombre ASC, precio DESC;
SELECT * FROM fabricante LIMIT 5;
SELECT * FROM fabricante LIMIT 2 OFFSET 3;
SELECT  nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;
SELECT  nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;
SELECT nombre FROM producto WHERE codigo_fabricante = 2;
SELECT producto.nombre AS 'nombre producto', producto.precio, fabricante.nombre AS 'fabricante'  FROM producto INNER JOIN fabricante  ON producto.codigo_fabricante = fabricante.codigo;
SELECT producto.nombre AS 'nombre producto', producto.precio, fabricante.nombre AS 'fabricante'  FROM producto INNER JOIN fabricante  ON producto.codigo_fabricante = fabricante.codigo ORDER BY fabricante.nombre ASC;
SELECT producto.codigo, producto.nombre, producto.codigo_fabricante, fabricante.nombre FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;
SELECT producto.nombre AS 'nombre producto', producto.precio, fabricante.nombre AS 'fabricante'  FROM producto INNER JOIN fabricante  ON producto.codigo_fabricante = fabricante.codigo  ORDER BY precio ASC LIMIT 1;
SELECT producto.nombre AS 'nombre producto', producto.precio, fabricante.nombre AS 'fabricante'  FROM producto INNER JOIN fabricante  ON producto.codigo_fabricante = fabricante.codigo  ORDER BY precio DESC LIMIT 1;
SELECT * FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = "Lenovo";
SELECT * FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = "Crucial" AND precio>200; 
SELECT producto.nombre AS 'nombre producto', producto.precio, fabricante.nombre AS 'fabricante'  FROM producto INNER JOIN fabricante  ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = "Asus" or fabricante.nombre ="Hewlett-Packard" or fabricante.nombre ="Seagate";
SELECT producto.nombre AS 'nombre producto', producto.precio, fabricante.nombre AS 'fabricante'  FROM producto INNER JOIN fabricante  ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre IN  ("Asus","Hewlett-Packard" ,"Seagate");
SELECT producto.nombre AS 'nombre producto', producto.precio, fabricante.nombre AS 'fabricante'  FROM producto INNER JOIN fabricante  ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre LIKE "%e";
SELECT producto.nombre AS 'nombre producto', producto.precio, fabricante.nombre AS 'fabricante'  FROM producto INNER JOIN fabricante  ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre LIKE "%w%";
SELECT * FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE precio>=180 ORDER BY producto.precio DESC, producto.nombre ASC ; 
SELECT distinct fabricante.nombre, fabricante.codigo FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;
SELECT fabricante.nombre, producto.nombre FROM fabricante LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante;
SELECT fabricante.nombre, producto.nombre FROM fabricante LEFT JOIN producto ON fabricante.codigo = producto.codigo_fabricante WHERE producto.codigo is NULL;
SELECT nombre, precio FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo");
SELECT * FROM producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo"));
SELECT nombre FROM producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo")) AND codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo");
SELECT nombre FROM producto WHERE precio = (SELECT MIN(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Hewlett-Packard")) AND codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Hewlett-Packard");
SELECT * FROM producto WHERE precio >= (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo"));
SELECT nombre FROM producto WHERE precio > (SELECT AVG(precio) FROM producto) AND codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Asus");
USE universidad;
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo = "alumno" ORDER BY apellido1, apellido2, nombre ASC;
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo ="alumno"  AND telefono IS NULL;
SELECT nombre, apellido1, apellido2 FROM persona WHERE fecha_nacimiento BETWEEN "1999/01/01" AND "1999/12/31";
SELECT * FROM persona WHERE tipo ="profesor"  AND telefono IS NULL AND nif LIKE "%K";
SELECT * FROM asignatura WHERE cuatrimestre = 1 AND id_grado=7 AND curso=3;
SELECT persona.apellido1, persona.apellido2, persona.nombre, departamento.nombre AS departamento FROM persona INNER JOIN profesor ON persona.id = profesor.id_profesor INNER JOIN departamento ON profesor.id_departamento = departamento.id ORDER BY persona.apellido1, persona.apellido2, persona.nombre ASC;
SELECT asignatura.nombre, curso_escolar.anyo_inicio, curso_escolar.anyo_fin FROM asignatura INNER JOIN alumno_se_matricula_asignatura ON asignatura.id = alumno_se_matricula_asignatura.id_asignatura INNER JOIN curso_escolar ON alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id INNER JOIN persona ON alumno_se_matricula_asignatura.id_alumno = persona.id WHERE persona.nif = "26902806M";
SELECT departamento.nombre FROM departamento INNER JOIN profesor ON departamento.id = profesor.id_departamento WHERE profesor.id_profesor = (SELECT id_profesor FROM asignatura WHERE id = (SELECT id FROM grado WHERE nombre = "Grado en Ingeniería Informática (Plan 2015)"));
SELECT distinct persona.* FROM persona INNER JOIN alumno_se_matricula_asignatura ON persona.id = alumno_se_matricula_asignatura.id_alumno WHERE alumno_se_matricula_asignatura.id_curso_escolar = (SELECT id FROM curso_escolar WHERE anyo_inicio = "2018");
SELECT departamento.nombre, persona.apellido1, persona.apellido2, persona.nombre FROM persona RIGHT JOIN profesor ON persona.id=profesor.id_profesor LEFT JOIN departamento ON profesor.id_departamento = departamento.id ORDER BY departamento.nombre, persona.apellido1, persona.apellido2, persona.nombre ASC;
SELECT persona.apellido1, persona.apellido2, persona.nombre FROM persona RIGHT JOIN profesor ON persona.id=profesor.id_profesor WHERE profesor.id_departamento IS NULL;
SELECT departamento.nombre FROM departamento LEFT JOIN profesor ON departamento.id = profesor.id_departamento WHERE profesor.id_profesor IS NULL;
SELECT * FROM persona LEFT JOIN asignatura ON persona.id = asignatura.id_profesor WHERE persona.tipo = "profesor" AND asignatura.id_profesor IS NULL;
SELECT * FROM asignatura WHERE id_profesor IS NULL;
SELECT  departamento.* FROM departamento LEFT JOIN profesor ON departamento.id = profesor.id_departamento LEFT JOIN asignatura ON profesor.id_profesor = asignatura.id_profesor WHERE asignatura.id_grado IS NULL;
SELECT count(id) AS 'nombre alumnes' FROM persona WHERE tipo = "alumno";
SELECT count(id) AS 'nº alumnes nascuts al 1999' FROM persona WHERE tipo = "alumno" AND fecha_nacimiento between "1999/01/01" AND "1999/12/31";
SELECT departamento.nombre, COUNT(profesor.id_departamento) AS 'nº profesors' FROM profesor INNER JOIN departamento ON profesor.id_departamento = departamento.id GROUP BY departamento.nombre ORDER BY COUNT(profesor.id_departamento) DESC;
SELECT departamento.nombre, COUNT(profesor.id_departamento) AS 'nº profesors' FROM departamento LEFT JOIN profesor ON departamento.id = profesor.id_departamento GROUP BY departamento.nombre;
SELECT grado.nombre, COUNT(asignatura.id) AS 'nº assignatures'  FROM grado LEFT JOIN asignatura ON grado.id = asignatura.id_grado GROUP BY grado.nombre ORDER BY COUNT(asignatura.id) DESC;
SELECT grado.nombre, COUNT(asignatura.id) AS 'nº assignatures'  FROM grado LEFT JOIN asignatura ON grado.id = asignatura.id_grado GROUP BY grado.nombre HAVING COUNT(asignatura.id) > 40;









