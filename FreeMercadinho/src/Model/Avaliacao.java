package Model;



public class Avaliacao {
		int nota;
		String cpf, nomeCaixa;
		
		public Avaliacao(int nota, String cpf, String nomeCaixa) {
			this.nota=nota;
			this.cpf=cpf;
			this.nomeCaixa=nomeCaixa;
		}
		

		public String getNomeCaixa() {
			return nomeCaixa;
		}

		public void setNomeCaixa(String nomeCaixa) {
			this.nomeCaixa = nomeCaixa;
		}

		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			this.nota = nota;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
	}
