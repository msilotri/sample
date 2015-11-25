package uk.gov.dwp.service.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import uk.gov.dwp.service.CountryService;

/**
 * Country service implementation
 * @author samba.mitra
 *
 */
@Service
public class CountryServiceImpl implements CountryService {

	@Override
	public Map<String, String> populateCountriesWithoutFrozenRate() {
		Map<String, String> countries = new LinkedHashMap<>();
		countries.put("", "");
		countries.put("MIXED YEAR", "MIXED YEAR");
		countries.put("ABROAD - NOT KNOWN", "ABROAD - NOT KNOWN");
		countries.put("ALDERNEY", "ALDERNEY");
		countries.put("ALGERIA", "ALGERIA");
		countries.put("AMERICAN SAMOA", "AMERICAN SAMOA");
		countries.put("ANDORRA", "ANDORRA");
		countries.put("ANGOLA", "ANGOLA");
		countries.put("ANGUILLA", "ANGUILLA");
		countries.put("ANTARCTIC TERRITORIES (BRITISH)", "ANTARCTIC TERRITORIES (BRITISH)");
		countries.put("ANTIGUA", "ANTIGUA");
		countries.put("ANTILLES (NETHERLANDS)", "ANTILLES (NETHERLANDS)");
		countries.put("ARAB EMIRATES (UNITED)", "ARAB EMIRATES (UNITED)");
		countries.put("ARUBA", "ARUBA");
		countries.put("AUSTRIA", "AUSTRIA");
		countries.put("BARBADOS", "BARBADOS");
		countries.put("BELGIUM", "BELGIUM");
		countries.put("BERMUDA", "BERMUDA");
		countries.put("BISSAU (GUINEA)", "BISSAU (GUINEA)");
		countries.put("BOUVET ISLAND", "BOUVET ISLAND");
		countries.put("BRITISH INDIAN OCEAN TERRITORIES", "BRITISH INDIAN OCEAN TERRITORIES");
		countries.put("BULGARIA", "BULGARIA");
		countries.put("BURUNDI", "BURUNDI");
		countries.put("CHAD", "CHAD");
		countries.put("COMORO ISLANDS", "COMORO ISLANDS");
		countries.put("COTE D’IVOIRE", "COTE D’IVOIRE");
		countries.put("CYPRUS", "CYPRUS");
		countries.put("DENMARK", "DENMARK");
		countries.put("DOMINICAN REPUBLIC", "DOMINICAN REPUBLIC");
		countries.put("EAST TIMOR", "EAST TIMOR");
		countries.put("ENGLAND", "ENGLAND");
		countries.put("EQUATORIAL GUINEA", "EQUATORIAL GUINEA");
		countries.put("ERITREA", "ERITREA");
		countries.put("FINLAND", "FINLAND");
		countries.put("FORMER YUG REP OF MACEDONIA", "FORMER YUG REP OF MACEDONIA");
		countries.put("FRANCE", "FRANCE");
		countries.put("FRENCH GUIANA", "FRENCH GUIANA");
		countries.put("FRENCH OVERSEAS DEPARTMENTS", "FRENCH OVERSEAS DEPARTMENTS");
		countries.put("FRENCH POLYNESIA", "FRENCH POLYNESIA");
		countries.put("FRENCH SOUTHERN TERRITORIES", "FRENCH SOUTHERN TERRITORIES");
		countries.put("GABON", "GABON");
		countries.put("GERMANY", "GERMANY");
		countries.put("GHANA", "GHANA");
		countries.put("GIBRALTAR", "GIBRALTAR");
		countries.put("GREAT BRITAIN", "GREAT BRITAIN");
		countries.put("GREECE", "GREECE");
		countries.put("GUADELOUPE", "GUADELOUPE");
		countries.put("GUAM", "GUAM");
		countries.put("GUERNSEY", "GUERNSEY");
		countries.put("HEARD ISLAND & MCDONALD ISLANDS", "HEARD ISLAND & MCDONALD ISLANDS");
		countries.put("HUNGARY", "HUNGARY");
		countries.put("ICELAND", "ICELAND");
		countries.put("IRELAND", "IRELAND");
		countries.put("ISLE OF MAN", "ISLE OF MAN");
		countries.put("ISRAEL", "ISRAEL");
		countries.put("ITALY", "ITALY");
		countries.put("JAMAICA", "JAMAICA");
		countries.put("JERSEY", "JERSEY");
		countries.put("LIECHTENSTEIN", "LIECHTENSTEIN");
		countries.put("LUXEMBOURG", "LUXEMBOURG");
		countries.put("MALAGASY REPUBLIC", "MALAGASY REPUBLIC");
		countries.put("MALI", "MALI");
		countries.put("MALTA", "MALTA");
		countries.put("MARSHALL ISLANDS", "MARSHALL ISLANDS");
		countries.put("MARTINIQUE", "MARTINIQUE");
		countries.put("MAURITANIA", "MAURITANIA");
		countries.put("MAURITIUS", "MAURITIUS");
		countries.put("MAYOTTE", "MAYOTTE");
		countries.put("MICRONESIA, FEDERATED STATES OF", "MICRONESIA, FEDERATED STATES OF");
		countries.put("MONGOLIA", "MONGOLIA");
		countries.put("MYANMAR", "MYANMAR");
		countries.put("NAURU", "NAURU");
		countries.put("NETHERLANDS", "NETHERLANDS");
		countries.put("NORTH KOREA", "NORTH KOREA");
		countries.put("NORTHERN IRELAND", "NORTHERN IRELAND");
		countries.put("NORTHERN MARIANA ISLANDS", "NORTHERN MARIANA ISLANDS");
		countries.put("NORWAY", "NORWAY");
		countries.put("NUIE", "NUIE");
		countries.put("PHILIPPINES", "PHILIPPINES");
		countries.put("PITCAIRN", "PITCAIRN");
		countries.put("POLAND", "POLAND");
		countries.put("PORTUGAL", "PORTUGAL");
		countries.put("PRINCIPE & SAO TOME", "PRINCIPE & SAO TOME");
		countries.put("PUERTO RICO", "PUERTO RICO");
		countries.put("REPUBLIC OF ARMENIA", "REPUBLIC OF ARMENIA");
		countries.put("REPUBLIC OF AZERBAIJAN", "REPUBLIC OF AZERBAIJAN");
		countries.put("REPUBLIC OF BELARUS", "REPUBLIC OF BELARUS");
		countries.put("REPUBLIC OF BOSNIA-HERCEGOVINA", "REPUBLIC OF BOSNIA-HERCEGOVINA");
		countries.put("REPUBLIC OF CROATIA", "REPUBLIC OF CROATIA");
		countries.put("REPUBLIC OF ESTONIA", "REPUBLIC OF ESTONIA");
		countries.put("REPUBLIC OF LATVIA", "REPUBLIC OF LATVIA");
		countries.put("REPUBLIC OF LITHUANIA", "REPUBLIC OF LITHUANIA");
		countries.put("REPUBLIC OF SLOVENIA", "REPUBLIC OF SLOVENIA");
		countries.put("REPUBLIC OF TAJIKISTAN", "REPUBLIC OF TAJIKISTAN");
		countries.put("REUNION", "REUNION");
		countries.put("ROMANIA", "ROMANIA");
		countries.put("SABAH", "SABAH");
		countries.put("SAINT PIERRE & MIQUELON", "SAINT PIERRE & MIQUELON");
		countries.put("SARK", "SARK");
		countries.put("SCOTLAND", "SCOTLAND");
		countries.put("SOUTH GEORGIA & SOUTH", "SOUTH GEORGIA & SOUTH");
		countries.put("SANDWICH ISLANDS", "SANDWICH ISLANDS");
		countries.put("SPAIN", "SPAIN");
		countries.put("STATE UNION OF SERBIA AND MONTENEGRO", "STATE UNION OF SERBIA AND MONTENEGRO");
		countries.put("STATELESS", "STATELESS");
		countries.put("SVALBARD & JAN MAYEN", "SVALBARD & JAN MAYEN");
		countries.put("SWEDEN", "SWEDEN");
		countries.put("SWITZERLAND", "SWITZERLAND");
		countries.put("THE CZECH REPUBLIC", "THE CZECH REPUBLIC");
		countries.put("THE RUSSIAN FEDERATION", "THE RUSSIAN FEDERATION");
		countries.put("THE SLOVAK REPUBLIC", "THE SLOVAK REPUBLIC");
		countries.put("TOKELAU", "TOKELAU");
		countries.put("TRISTAN DA CUNHA", "TRISTAN DA CUNHA");
		countries.put("TURKEY", "TURKEY");
		countries.put("TUVALU", "TUVALU");
		countries.put("UNITED STATES MINOR OUTLYING ISLANDS", "UNITED STATES MINOR OUTLYING ISLANDS");
		countries.put("USA", "USA");
		countries.put("VATICAN CITY STATE", "VATICAN CITY STATE");
		countries.put("VIRGIN ISLANDS (USA)", "VIRGIN ISLANDS (USA)");
		countries.put("WALES", "WALES");
		countries.put("WALLIS & FUTUNA", "WALLIS & FUTUNA");
		countries.put("WESTERN SAHARA", "WESTERN SAHARA");
		countries.put("WESTERN SAMOA", "WESTERN SAMOA");
		countries.put("ZAIRE (Rep. of CONGO)", "ZAIRE (Rep. of CONGO)");
		return countries;
	}

	@Override
	public Map<String, String> populateUsa() {
		Map<String, String> countries = new LinkedHashMap<>();
		countries.put("", "");
		countries.put("MIXED YEAR", "MIXED YEAR");
		countries.put("UK", "UK");
		countries.put("USA", "USA");
		return countries;
	}

	@Override
	public Map<String, String> populateAllCountries() {
		Map<String, String> countries = new LinkedHashMap<>();
		countries.put("", "");
		countries.put("ABROAD - NOT KNOWN", "ABROAD - NOT KNOWN");
		countries.put("AFGHANISTAN", "AFGHANISTAN");
		countries.put("ALBANIA", "ALBANIA");
		countries.put("ALDERNEY", "ALDERNEY");
		countries.put("ALGERIA", "ALGERIA");
		countries.put("AMERICAN SAMOA", "AMERICAN SAMOA");
		countries.put("ANDORRA", "ANDORRA");
		countries.put("ANGOLA", "ANGOLA");
		countries.put("ANGUILLA", "ANGUILLA");
		countries.put("ANTARCTIC TERRITORIES (BRITISH)", "ANTARCTIC TERRITORIES (BRITISH)");
		countries.put("ANTIGUA", "ANTIGUA");
		countries.put("ANTILLES (NETHERLANDS)", "ANTILLES (NETHERLANDS)");
		countries.put("ARAB EMIRATES (UNITED)", "ARAB EMIRATES (UNITED)");
		countries.put("ARGENTINA", "ARGENTINA");
		countries.put("ARUBA", "ARUBA");
		countries.put("ASCENSION ISLAND", "ASCENSION ISLAND");
		countries.put("AUSTRALIA", "AUSTRALIA");
		countries.put("AUSTRIA", "AUSTRIA");
		countries.put("BAHAMAS", "BAHAMAS");
		countries.put("BAHRAIN", "BAHRAIN");
		countries.put("BANGLADESH", "BANGLADESH");
		countries.put("BARBADOS", "BARBADOS");
		countries.put("BARBUDA", "BARBUDA");
		countries.put("BELGIUM", "BELGIUM");
		countries.put("BELIZE", "BELIZE");
		countries.put("BENIN", "BENIN");
		countries.put("BERMUDA", "BERMUDA");
		countries.put("BHUTAN", "BHUTAN");
		countries.put("BISSAU (GUINEA)", "BISSAU (GUINEA)");
		countries.put("BOLIVIA", "BOLIVIA");
		countries.put("BOTSWANA", "BOTSWANA");
		countries.put("BOUVET ISLAND", "BOUVET ISLAND");
		countries.put("BRAZIL", "BRAZIL");
		countries.put("BRITISH INDIAN OCEAN TERRITORIES", "BRITISH INDIAN OCEAN TERRITORIES");
		countries.put("BRUNEI", "BRUNEI");
		countries.put("BULGARIA", "BULGARIA");
		countries.put("BURKINA FASO", "BURKINA FASO");
		countries.put("BURMA (MYANMAR)", "BURMA (MYANMAR)");
		countries.put("BURUNDI", "BURUNDI");
		countries.put("CAMEROON", "CAMEROON");
		countries.put("CANADA", "CANADA");
		countries.put("CAPE VERDE ISLANDS", "CAPE VERDE ISLANDS");
		countries.put("CAYMAN ISLANDS", "CAYMAN ISLANDS");
		countries.put("CENTRAL AFRICAN REPUBLIC", "CENTRAL AFRICAN REPUBLIC");
		countries.put("CHAD", "CHAD");
		countries.put("CHILE", "CHILE");
		countries.put("CHINA PEOPLES REPUBLIC", "CHINA PEOPLES REPUBLIC");
		countries.put("COLOMBIA", "COLOMBIA");
		countries.put("COMORO ISLANDS", "COMORO ISLANDS");
		countries.put("CONGO", "CONGO");
		countries.put("COOK ISLANDS", "COOK ISLANDS");
		countries.put("COSTA RICA", "COSTA RICA");
		countries.put("COTE D’IVOIRE", "COTE D’IVOIRE");
		countries.put("CUBA", "CUBA");
		countries.put("CYPRUS", "CYPRUS");
		countries.put("DENMARK", "DENMARK");
		countries.put("DJIBOUTI", "DJIBOUTI");
		countries.put("DOMINICA COMMONWEALTH", "DOMINICA COMMONWEALTH");
		countries.put("DOMINICAN REPUBLIC", "DOMINICAN REPUBLIC");
		countries.put("EAST TIMOR", "EAST TIMOR");
		countries.put("ECUADOR", "ECUADOR");
		countries.put("EGYPT", "EGYPT");
		countries.put("EL SALVADOR", "EL SALVADOR");
		countries.put("ENGLAND", "ENGLAND");
		countries.put("EQUATORIAL GUINEA", "EQUATORIAL GUINEA");
		countries.put("ERITREA", "ERITREA");
		countries.put("ETHIOPIA", "ETHIOPIA");
		countries.put("FALKLAND ISLANDS & DEPS", "FALKLAND ISLANDS & DEPS");
		countries.put("FAROE ISLANDS", "FAROE ISLANDS");
		countries.put("FIJI", "FIJI");
		countries.put("FINLAND", "FINLAND");
		countries.put("FORMER YUG REP OF MACEDONIA", "FORMER YUG REP OF MACEDONIA");
		countries.put("FRANCE", "FRANCE");
		countries.put("FRENCH GUIANA", "FRENCH GUIANA");
		countries.put("FRENCH OVERSEAS DEPARTMENTS", "FRENCH OVERSEAS DEPARTMENTS");
		countries.put("FRENCH POLYNESIA", "FRENCH POLYNESIA");
		countries.put("FRENCH SOUTHERN TERRITORIES", "FRENCH SOUTHERN TERRITORIES");
		countries.put("GABON", "GABON");
		countries.put("GAMBIA", "GAMBIA");
		countries.put("GERMANY", "GERMANY");
		countries.put("GHANA", "GHANA");
		countries.put("GIBRALTAR", "GIBRALTAR");
		countries.put("GREAT BRITAIN", "GREAT BRITAIN");
		countries.put("GREECE", "GREECE");
		countries.put("GREENLAND", "GREENLAND");
		countries.put("GRENADA", "GRENADA");
		countries.put("GUADELOUPE", "GUADELOUPE");
		countries.put("GUAM", "GUAM");
		countries.put("GUATEMALA", "GUATEMALA");
		countries.put("GUERNSEY", "GUERNSEY");
		countries.put("GUINEA", "GUINEA");
		countries.put("GUYANA", "GUYANA");
		countries.put("HAITI", "HAITI");
		countries.put("HEARD ISLAND & MCDONALD ISLANDS", "HEARD ISLAND & MCDONALD ISLANDS");
		countries.put("HONDURAS", "HONDURAS");
		countries.put("HONG KONG", "HONG KONG");
		countries.put("HUNGARY", "HUNGARY");
		countries.put("ICELAND", "ICELAND");
		countries.put("INDIA", "INDIA");
		countries.put("INDONESIA", "INDONESIA");
		countries.put("IRAN", "IRAN");
		countries.put("IRAQ", "IRAQ");
		countries.put("IRELAND", "IRELAND");
		countries.put("ISLE OF MAN", "ISLE OF MAN");
		countries.put("ISRAEL", "ISRAEL");
		countries.put("ITALY", "ITALY");
		countries.put("JAMAICA", "JAMAICA");
		countries.put("JAPAN", "JAPAN");
		countries.put("JERSEY", "JERSEY");
		countries.put("JORDAN", "JORDAN");
		countries.put("KAMPUCHEA", "KAMPUCHEA");
		countries.put("KENYA", "KENYA");
		countries.put("KIRIBATI", "KIRIBATI");
		countries.put("KUWAIT", "KUWAIT");
		countries.put("LAOS", "LAOS");
		countries.put("LEBANON", "LEBANON");
		countries.put("LESOTHO", "LESOTHO");
		countries.put("LIBERIA", "LIBERIA");
		countries.put("LIBYA", "LIBYA");
		countries.put("LIECHTENSTEIN", "LIECHTENSTEIN");
		countries.put("LUXEMBOURG", "LUXEMBOURG");
		countries.put("MACAU", "MACAU");
		countries.put("MALAGASY REPUBLIC", "MALAGASY REPUBLIC");
		countries.put("MALAWI", "MALAWI");
		countries.put("MALAYSIA", "MALAYSIA");
		countries.put("MALDIVE ISLANDS", "MALDIVE ISLANDS");
		countries.put("MALI", "MALI");
		countries.put("MALTA", "MALTA");
		countries.put("MARSHALL ISLANDS", "MARSHALL ISLANDS");
		countries.put("MARTINIQUE", "MARTINIQUE");
		countries.put("MAURITANIA", "MAURITANIA");
		countries.put("MAURITIUS", "MAURITIUS");
		countries.put("MAYOTTE", "MAYOTTE");
		countries.put("MEXICO", "MEXICO");
		countries.put("MICRONESIA, FEDERATED STATES OF", "MICRONESIA, FEDERATED STATES OF");
		countries.put("MONACO", "MONACO");
		countries.put("MONGOLIA", "MONGOLIA");
		countries.put("MONTSERRAT", "MONTSERRAT");
		countries.put("MOROCCO", "MOROCCO");
		countries.put("MOZAMBIQUE", "MOZAMBIQUE");
		countries.put("MYANMAR", "MYANMAR");
		countries.put("NAMIBIA", "NAMIBIA");
		countries.put("NAURU", "NAURU");
		countries.put("NEPAL", "NEPAL");
		countries.put("NETHERLANDS", "NETHERLANDS");
		countries.put("NEVIS, ST KITTS-NEVIS", "NEVIS, ST KITTS-NEVIS");
		countries.put("NEW CALEDONIA", "NEW CALEDONIA");
		countries.put("NEW ZEALAND", "NEW ZEALAND");
		countries.put("NICARAGUA", "NICARAGUA");
		countries.put("NIGER", "NIGER");
		countries.put("NIGERIA", "NIGERIA");
		countries.put("NORFOLK ISLAND", "NORFOLK ISLAND");
		countries.put("NORTH KOREA", "NORTH KOREA");
		countries.put("NORTHERN IRELAND", "NORTHERN IRELAND");
		countries.put("NORTHERN MARIANA ISLANDS", "NORTHERN MARIANA ISLANDS");
		countries.put("NORWAY", "NORWAY");
		countries.put("NUIE", "NUIE");
		countries.put("OMAN", "OMAN");
		countries.put("PAKISTAN", "PAKISTAN");
		countries.put("PALAU", "PALAU");
		countries.put("PANAMA", "PANAMA");
		countries.put("PAPUA NEW GUINEA", "PAPUA NEW GUINEA");
		countries.put("PARAGUAY", "PARAGUAY");
		countries.put("PERU", "PERU");
		countries.put("PHILIPPINES", "PHILIPPINES");
		countries.put("PITCAIRN", "PITCAIRN");
		countries.put("POLAND", "POLAND");
		countries.put("PORTUGAL", "PORTUGAL");
		countries.put("PRINCIPE & SAO TOME", "PRINCIPE & SAO TOME");
		countries.put("PUERTO RICO", "PUERTO RICO");
		countries.put("QATAR", "QATAR");
		countries.put("REPUBLIC OF ARMENIA", "REPUBLIC OF ARMENIA");
		countries.put("REPUBLIC OF AZERBAIJAN", "REPUBLIC OF AZERBAIJAN");
		countries.put("REPUBLIC OF BELARUS", "REPUBLIC OF BELARUS");
		countries.put("REPUBLIC OF BOSNIA-HERCEGOVINA", "REPUBLIC OF BOSNIA-HERCEGOVINA");
		countries.put("REPUBLIC OF CROATIA", "REPUBLIC OF CROATIA");
		countries.put("REPUBLIC OF ESTONIA", "REPUBLIC OF ESTONIA");
		countries.put("REPUBLIC OF GEORGIA", "REPUBLIC OF GEORGIA");
		countries.put("REP. OF KAZAKHSTAN", "REP. OF KAZAKHSTAN");
		countries.put("REP. OF KYRGYZSTAN", "REP. OF KYRGYZSTAN");
		countries.put("REPUBLIC OF LATVIA", "REPUBLIC OF LATVIA");
		countries.put("REPUBLIC OF LITHUANIA", "REPUBLIC OF LITHUANIA");
		countries.put("REPUBLIC OF MALDOVIA", "REPUBLIC OF MALDOVIA");
		countries.put("REPUBLIC OF SLOVENIA", "REPUBLIC OF SLOVENIA");
		countries.put("REPUBLIC OF TAJIKISTAN", "REPUBLIC OF TAJIKISTAN");
		countries.put("REP. OF TURKMENISTAN", "REP. OF TURKMENISTAN");
		countries.put("REP. OF UZBEKISTAN", "REP. OF UZBEKISTAN");
		countries.put("REPUBLIC OF YEMEN", "REPUBLIC OF YEMEN");
		countries.put("REUNION", "REUNION");
		countries.put("ROMANIA", "ROMANIA");
		countries.put("RWANDA", "RWANDA");
		countries.put("SABAH", "SABAH");
		countries.put("SAINT PIERRE & MIQUELON", "SAINT PIERRE & MIQUELON");
		countries.put("SAN MARINO", "SAN MARINO");
		countries.put("SARAWAK", "SARAWAK");
		countries.put("SARK", "SARK");
		countries.put("SAUDI ARABIA", "SAUDI ARABIA");
		countries.put("SCOTLAND", "SCOTLAND");
		countries.put("SENEGAL", "SENEGAL");
		countries.put("SEYCHELLES", "SEYCHELLES");
		countries.put("SHARJAH", "SHARJAH");
		countries.put("SIERRA LEONE", "SIERRA LEONE");
		countries.put("SINGAPORE", "SINGAPORE");
		countries.put("SOLOMON ISLANDS", "SOLOMON ISLANDS");
		countries.put("SOMALIA", "SOMALIA");
		countries.put("SOUTH AFRICA", "SOUTH AFRICA");
		countries.put("SOUTH GEORGIA & SOUTH", "SOUTH GEORGIA & SOUTH");
		countries.put("SANDWICH ISLANDS", "SANDWICH ISLANDS");
		countries.put("SOUTH KOREA", "SOUTH KOREA");
		countries.put("SPAIN", "SPAIN");
		countries.put("SRI LANKA", "SRI LANKA");
		countries.put("ST HELENA & DEPS", "ST HELENA & DEPS");
		countries.put("ST LUCIA", "ST LUCIA");
		countries.put("ST MARTINS", "ST MARTINS");
		countries.put("ST VINCENT & GRENADINES", "ST VINCENT & GRENADINES");
		countries.put("STATE UNION OF SERBIA AND MONTENEGRO", "STATE UNION OF SERBIA AND MONTENEGRO");
		countries.put("STATELESS", "STATELESS");
		countries.put("SUDAN", "SUDAN");
		countries.put("SURINAM", "SURINAM");
		countries.put("SVALBARD & JAN MAYEN", "SVALBARD & JAN MAYEN");
		countries.put("SWAZILAND", "SWAZILAND");
		countries.put("SWEDEN", "SWEDEN");
		countries.put("SWITZERLAND", "SWITZERLAND");
		countries.put("SYRIA", "SYRIA");
		countries.put("TAHITI", "TAHITI");
		countries.put("TAIWAN", "TAIWAN");
		countries.put("TANZANIA", "TANZANIA");
		countries.put("THAILAND", "THAILAND");
		countries.put("THE CZECH REPUBLIC", "THE CZECH REPUBLIC");
		countries.put("THE RUSSIAN FEDERATION", "THE RUSSIAN FEDERATION");
		countries.put("THE SLOVAK REPUBLIC", "THE SLOVAK REPUBLIC");
		countries.put("TOGO", "TOGO");
		countries.put("TOKELAU", "TOKELAU");
		countries.put("TONGA", "TONGA");
		countries.put("TOURS", "TOURS");
		countries.put("TRINIDAD & TOBAGO", "TRINIDAD & TOBAGO");
		countries.put("TRISTAN DA CUNHA", "TRISTAN DA CUNHA");
		countries.put("TUNISIA", "TUNISIA");
		countries.put("TURKEY", "TURKEY");
		countries.put("TURKS & CAICOS ISLAND", "TURKS & CAICOS ISLAND");
		countries.put("TUVALU", "TUVALU");
		countries.put("UGANDA", "UGANDA");
		countries.put("UKRAINE", "UKRAINE");
		countries.put("UNITED STATES MINOR OUTLYING ISLANDS", "UNITED STATES MINOR OUTLYING ISLANDS");
		countries.put("URUGUAY", "URUGUAY");
		countries.put("USA", "USA");
		countries.put("VANUATU", "VANUATU");
		countries.put("VATICAN CITY STATE", "VATICAN CITY STATE");
		countries.put("VENEZUELA", "VENEZUELA");
		countries.put("VIETNAM", "VIETNAM");
		countries.put("VIRGIN ISLANDS (BRITISH)", "VIRGIN ISLANDS (BRITISH)");
		countries.put("VIRGIN ISLANDS (USA)", "VIRGIN ISLANDS (USA)");
		countries.put("WALES", "WALES");
		countries.put("WALLIS & FUTUNA", "WALLIS & FUTUNA");
		countries.put("WESTERN SAHARA", "WESTERN SAHARA");
		countries.put("WESTERN SAMOA", "WESTERN SAMOA");
		countries.put("ZAIRE (Rep. of CONGO", "ZAIRE (Rep. of CONGO");
		countries.put("ZAMBIA", "ZAMBIA");
		countries.put("ZIMBABWE", "ZIMBABWE");
		return countries;
	}
}
