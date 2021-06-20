package com.thaprobit.util;

/**
 * @author Tharinda Wickramaarachchi
 * @since 4/28/2020 11:46 PM
 * <p>
 * TODO Code with meaning
 */
public enum SystemMessages
{
	NOT_FOUND( "100", "Requested data not found" ),
	BAD_REQUEST( "101", "Malformed Request" ),
	INVALID_DATA( "102", "Invalid data State" ),
	SUCCESSFULLY_LOADED( "103", "Data successfully loaded" ),

	SUCCESS_SEARCH( "200", "Search Success" ),

	FACILITY_CREATE_SUCCESS( "1100", "Facility successfully saved" ),
	FACILITY_CREATE_FAILED( "1101", "Facility saving failed" ),
	FACILITY_UPDATE_SUCCESS( "1102", "Facility successfully updated" ),
	FACILITY_UPDATE_FAILED( "1103", "Facility update failed" ),
	FACILITY_DELETE_SUCCESS( "1104", "Facility successfully deleted" ),
	FACILITY_DELETE_FAILED( "1105", "Facility delete failed" ),

	TAG_CREATE_SUCCESS( "1200", "Tag successfully saved" ),
	TAG_CREATE_FAILED( "1201", "Tag saving failed" ),
	TAG_UPDATE_SUCCESS( "1202", "Tag successfully updated" ),
	TAG_UPDATE_FAILED( "1203", "Tag update failed" ),
	TAG_DELETE_SUCCESS( "1204", "Tag successfully deleted" ),
	TAG_DELETE_FAILED( "1205", "Tag delete failed" ),

	AVAIL_UNIT_CREATE_SUCCESS( "1300", "Availability Unit successfully saved" ),
	AVAIL_UNIT_CREATE_FAILED( "1301", "Availability Unit saving failed" ),
	AVAIL_UNIT_UPDATE_SUCCESS( "1302", "Availability Unit successfully updated" ),
	AVAIL_UNIT_UPDATE_FAILED( "1303", "Availability Unit update failed" ),
	AVAIL_UNIT_DELETE_SUCCESS( "1304", "Availability Unit successfully deleted" ),
	AVAIL_UNIT_DELETE_FAILED( "1305", "Availability Unit delete failed" ),

	PROPERTY_CREATE_SUCCESS( "1400", "Property successfully saved" ),
	PROPERTY_CREATE_FAILED( "1401", "Property saving failed" ),
	PROPERTY_UPDATE_SUCCESS( "1402", "Property successfully updated" ),
	PROPERTY_UPDATE_FAILED( "1403", "Property update failed" ),
	PROPERTY_DELETE_SUCCESS( "1404", "Property successfully deleted" ),
	PROPERTY_DELETE_FAILED( "1405", "Property delete failed" ),

	PROPERTY_VALIDATION_CONTRACT( "1410", "The contract already associated with a property" ),

	CONTRACT_CREATE_SUCCESS( "1500", "Contract successfully saved" ),
	CONTRACT_CREATE_FAILED( "1501", "Contract saving failed" ),
	CONTRACT_UPDATE_SUCCESS( "1502", "Contract successfully updated" ),
	CONTRACT_UPDATE_FAILED( "1503", "Contract update failed" ),
	CONTRACT_DELETE_SUCCESS( "1504", "Contract successfully deleted" ),
	CONTRACT_DELETE_FAILED( "1505", "Contract delete failed" ),

	PROMOTION_CREATE_SUCCESS( "1600", "Promotion successfully saved" ),
	PROMOTION_CREATE_FAILED( "1601", "Promotion saving failed" ),
	PROMOTION_UPDATE_SUCCESS( "1602", "Promotion successfully updated" ),
	PROMOTION_UPDATE_FAILED( "1603", "Promotion update failed" ),
	PROMOTION_DELETE_SUCCESS( "1604", "Promotion successfully deleted" ),
	PROMOTION_DELETE_FAILED( "1605", "Promotion delete failed" ),

	MENU_CREATE_SUCCESS( "1700", "Menu successfully saved" ),
	MENU_CREATE_FAILED( "1701", "Menu saving failed" ),
	MENU_UPDATE_SUCCESS( "1702", "Menu successfully updated" ),
	MENU_UPDATE_FAILED( "1703", "Menu update failed" ),
	MENU_DELETE_SUCCESS( "1704", "Menu successfully deleted" ),
	MENU_DELETE_FAILED( "1705", "Menu delete failed" ),

	PAYMENT_OPTION_CREATE_SUCCESS( "1800", "Payment Option successfully saved" ),
	PAYMENT_OPTION_CREATE_FAILED( "1801", "Payment Option saving failed" ),
	PAYMENT_OPTION_UPDATE_SUCCESS( "1802", "Payment Option successfully updated" ),
	PAYMENT_OPTION_UPDATE_FAILED( "1803", "Payment Option update failed" ),
	PAYMENT_OPTION_DELETE_SUCCESS( "1804", "Payment Option successfully deleted" ),
	PAYMENT_OPTION_DELETE_FAILED( "1805", "Payment Option delete failed" ),

	CHOICE_CREATE_SUCCESS( "1900", "Choice successfully saved" ),
	CHOICE_CREATE_FAILED( "1901", "Choice saving failed" ),
	CHOICE_UPDATE_SUCCESS( "1902", "Choice successfully updated" ),
	CHOICE_UPDATE_FAILED( "1903", "Choice update failed" ),
	CHOICE_DELETE_SUCCESS( "1904", "Choice successfully deleted" ),
	CHOICE_DELETE_FAILED( "1905", "Choice delete failed" ),

	SPECIALITY_CREATE_SUCCESS( "2000", "Speciality successfully saved" ),
	SPECIALITY_CREATE_FAILED( "2001", "Speciality saving failed" ),
	SPECIALITY_UPDATE_SUCCESS( "2002", "Speciality successfully updated" ),
	SPECIALITY_UPDATE_FAILED( "2003", "Speciality update failed" ),
	SPECIALITY_DELETE_SUCCESS( "2004", "Speciality successfully deleted" ),
	SPECIALITY_DELETE_FAILED( "2005", "Speciality delete failed" ),

	AVAILABILITY_DATA_UPDATE_SUCCESS( "2102", "Availability Data update successfully." ),
	AVAILABILITY_DATA_UPDATE_FAILED( "2103", "Availability Data update failed." ),

	LOCATION_BASED_CREATE_SUCCESS( "2200", "Location Based successfully saved" ),
	LOCATION_BASED_CREATE_FAILED( "2201", "Location Based saving failed" ),
	LOCATION_BASED_UPDATE_SUCCESS( "2202", "Location Based successfully updated" ),
	LOCATION_BASED_UPDATE_FAILED( "2203", "Location Based update failed" ),
	LOCATION_BASED_DELETE_SUCCESS( "2204", "Location Based successfully deleted" ),
	LOCATION_BASED_DELETE_FAILED( "2205", "Location Based delete failed" ),

	EVENT_CREATE_SUCCESS( "2300", "Event successfully saved" ),
	EVENT_CREATE_FAILED( "2301", "Event saving failed" ),
	EVENT_UPDATE_SUCCESS( "2302", "Event successfully updated" ),
	EVENT_UPDATE_FAILED( "2303", "Event update failed" ),
	EVENT_DELETE_SUCCESS( "2304", "Event successfully deleted" ),
	EVENT_DELETE_FAILED( "2305", "Event delete failed" ),

	RESERVATION_CREATE_SUCCESS( "2400", "Reservation successfully saved" ),
	RESERVATION_CREATE_FAILED( "2401", "Reservation saving failed" ),
	RESERVATION_UPDATE_SUCCESS( "2402", "Reservation successfully updated" ),
	RESERVATION_UPDATE_FAILED( "2403", "Reservation update failed" ),
	RESERVATION_DELETE_SUCCESS( "2404", "Reservation successfully deleted" ),
	RESERVATION_DELETE_FAILED( "2405", "Reservation delete failed" ),

	USER_CREATE_SUCCESS( "2500", "User successfully saved" ),
	USER_CREATE_FAILED( "2501", "User saving failed" ),
	USER_UPDATE_SUCCESS( "2502", "User successfully updated" ),
	USER_UPDATE_FAILED( "2503", "User update failed" ),
	USER_DELETE_SUCCESS( "2504", "User successfully deleted" ),
	USER_DELETE_FAILED( "2505", "User delete failed" );

	private final String code;
	private final String reasonPhrase;


	SystemMessages( String code, String reasonPhrase )
	{
		this.code = code;
		this.reasonPhrase = reasonPhrase;
	}

	public String code()
	{
		return this.code;
	}

	public String getReasonPhrase()
	{
		return this.reasonPhrase;
	}
}
