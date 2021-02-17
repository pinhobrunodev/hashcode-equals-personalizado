## HASHCODE E EQUALS CLASSE PERSONALIZADA


1-Suposto problema em que seja necessario comparar os objetos do tipo Client
2-Vamos comparar o email e nome...
2.1-Nao sera possivel comparar so por nome.. pois as pessoas podem ter nomes iguais,porem email diferente
e segue a mesma logica para comparacao somente por email...

📌

    Comparação de objetos por meio do name e email.

 	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


📌 Programa....

        Client client = new Client("Bruno","bruno@gmail.com");
        Client client2  = new Client("Jose", "jose@gmail.com");
        Client client3  = new Client("Jose", "jose@gmail.com");


        System.out.println(client.hashCode());  // HASHCODE  -608985072
        System.out.println(client2.hashCode()); // HASHCODE  -1078395984
        System.out.println(client3.hashCode()); // HASHCODE  -1078395984
        

        System.out.println(client.equals(client2)); // false,hashcode diferente ou seja conteudo diferente
        System.out.println(client2.equals(client3)); // true,pois o hashcode sao iguais e o conteudo igual porem referencia de memoria diferente


📌 Saída.....


       -608985072
       -1078395984
       -1078395984
       false
       true 

