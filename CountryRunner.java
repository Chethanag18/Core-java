class CountryRunner
{
	public static void main(String[] args)
	{
		String[] stateOfIndia={"Andra Pradesh","Arunachal Pradesh","Assam","Bihar","Chattisgarh","Goa","Gujrat","Haryana","Himachal Pradessh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","TamilNadu","Telangana","Tripura","Uttar Pradesh"};
		Country.states(stateOfIndia);
		int[] pincodeOfCities={577004,560021,560061,5770028,577006,577002,577003,560028,560079,560103};
		Country.pincode(pincodeOfCities);
		String[] primeMinisters={"Jawaharlal Nehru","Gulzarilal nanda","Lal Bahadur Shastri","Indira Gandhi","Morarji Desai","Charan Singh","Rajiv Gandhi","V.P.Singh","Chandra Shekhar","P.V Narasimha Roa","Atal Bihari Vajpayee","H.D Deve Gowda","Inder Kumar Gujral","Manmohan Singh","Narendra Modi"};
		Country.primeminister(primeMinisters);
		String[] cabinetMinisters={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin JaiRam Gadkari","Smt.Nirmala Sitharaman","Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar ","Shri Jagat Prakash Nadda","Shri Manohar Lal","Shri H. D. Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra Pradhan","Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan","Shri Pralhad Joshi","Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Gajendra Singh","Smt. Annpurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		Country.cabinet(cabinetMinisters);
		String[] politicalParties={"BJP","BSP","AAP","NPP","CPI-M"};
		Country.parties(politicalParties);
		
	}
	
}