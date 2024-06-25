package calidacao;

public class EntidadeValidacao {

	 public Integer validaPeso(String pesoCobrastr) {
				
				int pesoCobraint;
				try {
					pesoCobraint = Integer.parseInt(pesoCobrastr);
				} catch (Exception e) {
					return null;
				}
				
				return pesoCobraint;
			}

}
