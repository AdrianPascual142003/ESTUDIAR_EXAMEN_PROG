# EXAMEN PROG

## Funcionamiento de LocalDateTime Entrada

Para que funcione todo lo primero que tenemos que hacer será crear un **DateTimeFormatter** con el formato de entrada, es decir haciendo uso del metodo que nos proporciona la clase *.ofPattern* al cual le pasaremos el formato de entrada que queramos usar.

Luego trataremos la excepción *DateTimeParseException*. Finalmente si la fecha introducida sigue el formato que hemos creado entonces devolveremos la fecha con un metodo del **LocalDateTime llamado parse** al cual le pasaremos primero que todo el String el cual contiene la cadena de texto y luego el formato de entrada, en el caso que concuerde este devolverá el String en formato LocalDateTime, y en el caso de que no este mostrará por pantalla el error y volverá a pedir la fecha.  

<br>

```Java
    public  static LocalDateTime getLocalDateTime(String mensaje) {
        do {
            String localDateTime = getString(mensaje);
            try {
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
                return LocalDateTime.parse(localDateTime, inputFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Error! Has de seguir el format de la data");
            }
        }while (true);
    }
```

## SET

Son colecciones que no permiten elementos duplicados, cada elemento es único, por lo que no podrán repetirse

<br>

### Excluir Repetidos (HASHSET)

Para hacer la ordenación de hashet lo primero que tendremos que hacer será crear un **hashet** con los valores que queramos comprobar para ver si esta su existencia. Para hacer esto lo que haremos será redefinir el método que dispone este llamado **hashCode**.  

<br>

```Java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
```

Al **hashCode** también le podemos pasar varias cosas a comparar como por ejemplo el nombre, el apellido y la edad

```Java
    @Override
    public int hashCode() {
        return Objects.hash(nombre,apellido,edad);
    }
```

### Ordenacion (TreeSet)

Para ordenar el contenido de un treeset hemos de implementar la interfaz **comparable** el cual implementará el método *compareTo* el cual retornará un entero(int), para ello podemos hacerlo de dos formas:

<br>

> String: Podemos retornar un entero comparando el texto de ese mismo objeto por el del otro pasado, de la siguiente manera:

```Java
    @Override
    public int compareTo(Persona o) {
        return nombre.compareTo(o.getNombre());
    }
```

> Enteros: Podemos retornar un entero restando los enteros de tal forma que si da menos será menor, si da más será mayor y si no pues será igual, de la siguiente manera:

>> De menor a mayor:

```Java
    @Override
    public int compareTo(Persona o) {
        return edad-o.getEdad();
    }
```

>> De mayor a menor:

```Java
    @Override
    public int compareTo(Persona o) {
        return o.getEdad()-edad;
    }
```

## HASHMAP

Es un conjunto de set en el que los elementos son llaves y cada llave tiene un valor. Un ejemplo podría ser este:

<br>

```Java
        Map<String, Integer> tablaPuntuaciones = new HashMap<>();

        tablaPuntuaciones.put("Adrian",12);
        tablaPuntuaciones.put("Jorge",21);
        tablaPuntuaciones.put("Miguel",4);
```

Por defecto el **Map** no se puede iterar, pero hay una forma de hacerlo que sería esta:

```Java
        for (Map.Entry jugador: tablaPuntuaciones.entrySet()) {
            System.out.println(jugador.getKey() + "\t");
            System.out.println(jugador.getValue());
        }
```

