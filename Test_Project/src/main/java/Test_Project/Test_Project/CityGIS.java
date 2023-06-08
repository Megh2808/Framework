package Test_Project.Test_Project;

public class CityGIS {
	public static final String img_logo="//*[@title='Jhansi Smart City']";
	public static final String txt_logo_English="/html/body/header/div[1]/form/button/h3";
	public static final String txt_logo_Hindi="/html/body/header/div[1]/form/button/h5";
	public static final String img_UserProfile="//*[@id='PortalLayoutbody']/header/div[2]/div";
	public static final String txt_Welcome_UserProfile="//*[@id='PortalLayoutbody']/header/div[2]/div/ul/li/div/div/span";

	public static final String Scale="//*[@id='mapdiv']/div/div/div/div/div/div/div/div/div[2]/div[2]/div[5]/div";
	
	
	
	/*----------------------------------------------------Tools-----------------------------------------------------------*/
	
	public static final String Tool_Home="//*[text()='Home']";
	public static final String Tool_ZoomIN="//*[@title='Fixed Zoom In']";
	public static final String Tool_Identify="//a[@id='featureinfo']";
	public static final String Tool_Length="//a[@id='measurelength']";
	public static final String Tool_Area="//a[@id='measurearea']";
	public static final String Tool_Image="//li[@id='image-menu']";
	public static final String Tool_Coordinates="//a[@id='coordinatesearch']";
	public static final String Tool_Swipe="//li[@title='Swipe']";
	public static final String Tool_Search="//a[@onclick='mySearch();']";
	public static final String Tool_Pan="//a[@title='Pan']";
	public static final String Tool_Previous="//a[@title='Previous']";
	public static final String Tool_Next="//a[@title='Next']";
	public static final String Tool_ClearSelection="//a[@title='Clear selection']";
	public static final String Tool_Print="//a[@title='Print']";
	public static final String Tool_Bookmark="//a[@id='addbookmark']";
	public static final String Tool_Help="/html/body/header/div[2]/ul[2]/li[7]/a[1]";
	public static final String Tool_CurrentLocation="//a[@title='Current Location']";
	public static final String Tool_ZoomOUT="//a[@title='Fixed Zoom Out']";
	public static final String Tool_StopBlink="//a[@title='Stop Blink']";
	
	
	
	/*----------------------------------------------------Layer Panel-----------------------------------------------------------*/
	
	public static final String txt_Layers_title="//*[text()=' Layers']";
	private static final String j = null;
	public static String icon_Layers="/html/body/section/aside/div/a";
	public static String btn_Layers_cross="/html/body/section/aside/nav/div[1]/div/div[2]/span";
	public static String txtbox_Layers_Search="//input[@id='txt_search_layer']";
	public static String link_Layers_LayerOff="//a[text()='All Layers Off']";
	public static String link_Layers_Legend="";
	public static String link_Layers_Reset="//a[text()='Reset']";
	public static String Layers_section="/html/body/section/aside";
	public static String Layers_OpenStreet="/html/body/section/aside/nav/ul/div/div/div/div/div/div[2]/div[1]/div/div/ul/div/li[1]/ul/li[1]/div/input";
	public static String Layers_WardBoundary="/html/body/section/aside/nav/ul/div/div/div/div/div/div[2]/div[1]/div/div/ul/div/li[1]/ul/li[3]/div/input";
	public static String LayersMunicipalBoundary="/html/body/section/aside/nav/ul/div/div/div/div/div/div[2]/div[1]/div/div/ul/div/li[1]/ul/li[4]/div/input";
	public static String Layers_JhansiNigam="/html/body/section/aside/nav/ul/div/div/div/div/div/div[2]/div[1]/div/div/ul/div/li[10]/ul/li[1]/div/input";
	public static String Layers_GovernmentBiulding="/html/body/section/aside/nav/ul/div/div/div/div/div/div[2]/div[1]/div/div/ul/div/li[10]/ul/li[2]/div/input";
	public static String Layers_JhansiImage="//input[@class='x-tree-node-cb Jhansi_Image']";
	
	
	public static String txt_Search_FireStation="(//*[contains(text(),'Fire Stations.')])[1]";
	public static String checkbox_Layer="/html/body/section/aside/nav/ul/div/div/div/div/div/div[2]/div[1]/div/div/ul/div/li/ul/li/div/input";
	public static String icon_Layer_plus="//ul/div/li/div[@class='x-tree-node-el x-unselectable x-tree-node-collapsed']";
	public static String icon_Layer_minus="//ul/div/li/div[@class='x-tree-node-el x-unselectable x-tree-node-expanded']";
	
	/*----------------------------------------------------Layer panel Dropdown-----------------------------------------------------*/	
	public static String dd_Layers_LayerInfo="//span[text()='Get Layer information']";
	public static String dd_Layers_LayerExtent="//span[text()='Zoom to Layer Extent']";
	public static String dd_Layers_LayerOpacity="//span[text()='Change Layer opacity']";
	
	
	
	public static String txt_LayerInfo_popup_Title="//*[@id=\"ext-gen272\"]";
	public static String btn_LayerInfo_close="//div[@class='x-tool x-tool-close']";
	public static String icon_LayerInfo="//*[@id=\"ext-gen283\"]";
	public static String txt_LayerInfo_content="//*[@id=\"ext-gen284\"]";
	public static String btn_LayerInfo_OK="//button[text()='OK']";
	
	
	/*----------------------------------------------------Opacity-----------------------------------------------------------*/	
	
	public static String ScrollBar="//*[@id=\"ext-gen273\"]";
	public static String txt_OpacityPopup_Title="//span[text()='Opacity']";
	public static String btn_OpacityPopup_Close="//div[@id='WinOpacity-OpenLayers_Layer_WMS_272']/div[1]/div/div/div/div";
	public static String Slider_OpacityPopup="//*[@id=\"ext-comp-1069\"]";
	
	
	/*----------------------------------------------------Bookmark-----------------------------------------------------------*/
	
	public static String txt_Bookmark_Title="//span[text()='Add a bookmark']";
	public static String btn_Bookmark_Close="//div[@id='ext-comp-1063']/div[1]/div/div/div/div";
	public static String txt_Bookmark_Name="//label[text()='Name:']";	
	public static String txt_Bookmark_Description="//label[text()='Description:']";
	public static String txtbox_Bookmark_Name="//input[@id='ed_name']";	
	public static String txtbox_Bookmark_Description="//input[@id='ed_desc']";	
	public static String btn_Bookmark_Add="//button[text()='Add']";
	public static String btn_Bookmark_Cancel="//button[text()='Cancel']";
	
	public static String txt_Bookmark_Title_LayerPanel="//span[text()='Bookmarks']";
	public static String txt_YourBookmarks_LayerPanel="//div[text()='Your bookmarks']";
	public static String txt_BookmarkName_LayerPanel="//a[text()='Test Name']";
	public static String btn_Bookmark_Delete_LayerPanel="//div[@id='hr-bookmarks']/div[2]/div/div/div[3]";
	
	
	/*-----------------------------------------------------Identify------------------------------------------------------------*/
	
	public static String txt_IdentifyPopup_Title="//span[text()='Feature Info']";
	public static String btn_IdentifyPopup_Close="//*[@id=\"ext-gen255\"]";
	public static String btn_Identify_Table="//button[text()='Table']";
	public static String btn_Identify_Detail="//button[text()='Detail']";
	public static String btn_Identify_Download="//button[text()='Download']";
	public static String dd_Identify_CSV="//span[text()='as Comma Separated Values (CSV)']";
	public static String dd_Identify_Excel="//span[text()='as Excel (XLS)']";
	public static String dd_Identify_GML="//span[text()='as GML v2']";
	public static String dd_Identify_GeoJSON="//span[text()='as GeoJSON']";
	
	
	
	/*---------------------------------------------------Length-------------------------------------------------------------------*/
	
	public static String Length_OnMap="(//div[text()='Length: 4.64 km'])[2]";
	public static String Length_OnStatusBar="(//div[text()='Length: 4.64 km'])[1]";
	public static String Line="//*[@id='OpenLayers_Geometry_LineString_418']";
	
	
	/*---------------------------------------------------Area--------------------------------------------------------------------*/
	
	public static String Area_OnMap="(//div[text()='Area: 11.99 km²'])[2]";
	public static String Area_OnStatusBar="(//div[text()='Area: 11.99 km²'])[1]";	
	public static String Polygon="//*[@id='OpenLayers_Geometry_Polygon_420']";
	
	
	
	/*---------------------------------------------------Coordinates--------------------------------------------------------------------*/
	
	public static String txt_Coordinates_Title="//span[text()='Go to coordinates']";	
	public static String btn_Coordinates_Close="//div[@id='ext-comp-1087']/div[1]/div/div/div/div";
	public static String txt_Coordinates_Longitude="//label[text()='Lon [Grad]:']";
	public static String txtbox_Coordinates_Longitude="//input[@id='ext-gen252']";
	public static String txt_Coordinates_Latitude="//label[text()='Lat [Grad]:']";
	public static String txtbox_Coordinates_Latitude="//input[@id='ext-gen253']";
	public static String txt_Coordinates_Zoom="//label[text()='Zoom:']";
	public static String dd_Coordinates_Zoom="//input[@id='ext-comp-1080']";
	public static String txt_Coordinates_RememberLocation="//label[text()='Remember locations']";
	public static String chckbox_Coordinates_RememberLocation="//input[@id='ext-comp-1081']";
	public static String txt_Coordinates_RemoveMarker="//label[text()='Remove markers on close']";
	public static String chckbox_Coordinates_RemoveMarker="//input[@id='ext-comp-1082']";
	public static String btn_Coordinates_MarkerPosition="//label[text()='Marker position: ']";
	public static String btn_Coordinates_RemoveMarker="//button[text()='Remove markers']";
	public static String btn_Coordinates_GO="//button[text()='Go!']";
	public static String pinpoint_Coordinates="//img[@id='OL_Icon_419_innerImage']";
	
	
	public static String Coordinate_X="//div[@id='x-coord']";
	public static String Coordinate_Y="//div[@id='y-coord']";
	
	
	
	/*--------------------------------------------------------Swipe--------------------------------------------------------------------*/
	
	public static String WardBoundary="//span[text()='Ward Boundary.']";
	public static String dd_Swipe_ByLayer="//li[@title='By Layer']/a/span";
	public static String dd_Swipe_ByPointer="//li[@title='By Pointer']/a/span";
	public static String txt_SwipeLayer_Title="//span[text()='Swipe']";	
	public static String txt_SwipeLayer_StartSwipe="//span[text()='Start Swipe']";
	public static String txt_SwipeLayer_StopSwipe="//span[text()='Stop Swipe']";
	public static String Validation_SwipeLayer="//span[text()='Select Proper Layer Before Swipe Start']";
	
	
	
	public static String btn_Swipe_Close="//*[@id=\"ext-gen254\"]";
	public static String btn_Swipe_OK="//button[text()='OK']";
	
	public static String txt_SwipePointer_Title="//span[text()='Swipe Pointer']";	
	public static String txt_SwipePointer_StartSwipe="//span[text()='Start Swipe Pointer']";
	public static String txt_SwipePointer_StopSwipe="//span[text()='Stop Swipe Pointer']";
	public static String Validation_SwipePointer="//span[text()='Select Proper Layer Before Swipe Pointer Start']";
	
	
	/*--------------------------------------------------------Search--------------------------------------------------------------------*/
	
	public static String txtbox_Search="//input[@id='navbar-search-input']";
	
	public static String btn_Search_Close="//span[@id='inpsearch']";
	public static String icon_Search="(//i[@class='fa fa-search'])[2]";
	public static String txt_SearchGrid_Title="//*[text()='Search Result']";
	
	public static String dd_SearchGrid_ShowEntries="(//*[contains(text(),'Show')])[1]";
	
	public static String btn_SearchGrid_Copy="//*[text()='Copy']";
	public static String btn_SearchGrid_Excel="//*[text()='Excel']";
	public static String btn_SearchGrid_PDF="//*[text()='PDF']";
	public static String btn_SearchGrid_CSV="//*[text()='CSV']";
	public static String btn_SearchGrid_ColumnVisibility="//*[text()='Column visibility']";
	public static String btn_SearchGrid_Previous="//a[text()='Previous' and @id='example_previous']";
	public static String btn_SearchGrid_Next="//a[text()='Next' and @id='example_next']";
	public static String txtbox_SearchGrid_Search="//div[@id='GridData']/div[3]/div/div/label/input";
	public static String btn_SearchGrid_FullScreen="//button[@title='fullscreen']";
	public static String btn_SearchGrid_Collapse="(//i[@class='fa fa-minus'])[7]";
	public static String btn_SearchGrid_Expand="(//i[@class='fa fa-plus'])[2]";
	public static String btn_SearchGrid_Close="//button[@onclick='CloseGridModalDialog(this);']";
	
	public static String txt_SearchGrid_EntriesStatus="//div[@id='example_info']";
	
	public static String btn_SearchGrid_Location="//button[@title='GPS']";
	
	public static String Buttons_SearchGrid="/html/body/footer/div/div/div/div[3]/div[1]/div[3]/button["+j+"]";
	public static String Columns_SearchGrid="//div[@id='GridModalDialog']/div/div/div[3]/table/thead/tr/th";
	
	public static String Pinpoint_SearchGrid="//img[@id='OL_Icon_419_innerImage']";
	public static String SearchResult_SearchGrid="//a[text()='Dev Academy Wonder Play ']";
	
	
	
	/*----------------------------------------------------Help--------------------------------------------------------------------*/
	
	
	public static String dd_Help="(//*[text()=' Help'])[2]";
	public static String dd_TakeTour="//*[text()='Take a tour']";
	
	
	/*----------------------------------------------------Take a Tour--------------------------------------------------------------------*/
	
	public static String btn_Tour_Skip="//a[text()='Skip']";
	public static String btn_Tour_Back="//a[text()='↿ Back']";	
	public static String btn_Tour_Next="//a[text()='Next →']";
	public static String txt_Tour_Content="/html/body/div[13]/div/div[1]";
	
	
	
	
	
	
	
	/*----------------------------------------------------GIS Utilities-----------------------------------------------------------*/	
	
	public static String txt_GISUtilites_Title="//aside[@id='modalDeptDashboard']/nav/div/h3";
	
	public static final String btn_AroundMe="//*[text()='Around Me']";
	public static final String btn_Landmarks="//*[text()='Landmarks']";
	public static final String btn_WardInfo="//*[text()='Ward Information']";
	public static final String btn_FindDirection="//*[text()='Find Direction']";
	public static final String btn_RealtimeDashboard="//*[text()='Realtime Dashboard']";
	public static final String btn_Feedback="//*[text()='Feedback']";
	public static final String btn_GISUtilities_Collpase="//a[@id='btnDashboardCaret']";
	
	
	  /*----------------------------------------Common------------------------------------------------*/
	
	
	public static final String validation_btn_OK="//button[text()='OK']";
	public static final String validation_text="//*[@id=\"PortalLayoutbody\"]/div[12]/p";
	
	
	public static final String txt_DetailedResult_Title="//h3[text()='Detailed Result']";
	
	
	public static final String btn_Expand_DetailedResult_GISUtilities="//div[@id='landmarkdetailresult']/div[1]/button";
	
	public static final String btn_More_DetailedResult_GISUtilities="(//a[text()='More'])[1]";
	
	public static final String btn_Distance_DetailedResult_GISUtilities="(//a[text()=' Distance'])[1]";
	
	public static final String btn_Collapse_DetailedResult_GISUtilities="//aside[@id='modalNearbyquery']/form/div/div/button[2]";
	public static final String btn_Close_DetailedResult_GISUtilities="//aside[@id='modalNearbyquery']/form/div/div/button[3]";
	
	public static final String btn_Back_DetailedResult_GISUtilities="//aside[@id='modalNearbyquery']/form/div/div/button[1]";
	
	
	
	public static final String txt_Content_DetailedResult="//div[@id='landmarkdetailresultdetail']";
	 
	public static final String txt_Records_DetailedResult="//div[@id='landmarkdetailresult']/div/div/div/h3";
	
	public static final String btn_Next_DetailedResult="//div[@id='landmarkdetailresult']/div/div/div/div/button";
	
	public static final String btn_Previuos_DetailedResult="//div[@id='landmarkdetailresult']/div/div/div/div/button[1]";
	
	
	
	
	  /*---------------------------------------Around Me---------------------------------------------*/
	
	
	
	public static final String btn_EmergencyServices_AroundMe="//a[@id='emergencyservices']";
	public static final String btn_TouristAttraction_AroundMe="//a[@id='touristattraction']";
	public static final String btn_FunEntertainment_AroundMe="//a[@id='funandentertainment']";
	
	
	
	
	
	
	
	
	 /*---------------------------------------Landmark---------------------------------------------*/
	
	public static final String chckbox_ATM_Landmark="//ul[@id='divLoadPartial_Landmarks']/form/div/div/div/ul/li[1]/a/label/input";
	
	public static final String btn_Next_Landmark="//*[@id=\"btnlandmarknextresult\"]";
	public static final String btn_Clear_Landmark="//ul[@id='divLoadPartial_Landmarks']/form/div/div/div[2]/button[2]";
	
	public static final String dd_Distance_Landmark="//*[@id=\"txtlandmarkbuffer\"]";
	
	
	public static final String btn_GO_Landmark="//*[@id=\"btnlocationgo\"]";
	
	public static final String Buffer_Landmark="//*[@id=\"OpenLayers_Geometry_Polygon_708\"]";
	
	
	public static final String radiobtn_WardBoundary_Landmark="//input[@id='landmarkrdbyBoundary']";
	public static final String dd_WardBoundary_Landmark="//select[@id='ddlBoundaryvalue']";
	
	
	 /*---------------------------------------Ward Info---------------------------------------------*/
	
	
	public static final String txt_WardName_WardInfo="(//label[text()='Ward Name '])[1]";
	
	public static final String dd_WardName_WardInfo="//select[@id='ddlWardname']";
	
	public static final String btn_GO_WardInfo="(//*[text()='Go '])[2]";
	
	public static final String txt_Title_WardInfo_Popup="//span[@id='ui-id-6']";
	
	public static final String btn_Collapse_WardInfo_Popup="//div[@aria-labelledby='ui-id-6']/div/button[3]";
	
	public static final String btn_Restore_WardInfo_Popup="//div[@aria-labelledby='ui-id-6']/div/button[2]";
	
	public static final String btn_Close_WardInfo_Popup="//div[@aria-labelledby='ui-id-6']/div/button[1]";
	
	public static final String content_WardInfo_Popup="/html/body/div[11]/aside/form/div[1]";
	
	
	/*---------------------------------------Find Direction---------------------------------------------*/
	
	public static final String txt_Title_FindDirection_Popup="//span[@id='ui-id-6']";
	
    public static final String btn_Collapse_FindDirection_Popup="//div[@aria-labelledby='ui-id-6']/div/button[3]";
	
	public static final String btn_Restore_FindDirection_Popup="//div[@aria-labelledby='ui-id-6']/div/button[2]";
	
	public static final String btn_Close_FindDirection_Popup="//div[@aria-labelledby='ui-id-6']/div/button[1]";
	
	public static final String txtbox_SourceLocation_FindDirection_Popup="//input[@id='search_input_from']";
	
	public static final String txtbox_DestinationLocation_FindDirection_Popup="//input[@id='search_input_to']";
	
	public static final String btn_CurrentLocation_FindDirection_Popup="//button[@id='GPS']";
	
	public static final String chckbox_4Wheeler_FindDirection_Popup="//input[@id='chkroad4wheeler']";
	
	public static final String btn_Direction_FindDirection_Popup="//button[@id='networkGo']";
	
	public static final String btn_Clear_FindDirection_Popup="(//button[@id='networkClear'])[2]";
	
	public static final String content_FindDirection_Popup="//div[@id='divLandmarkNetworkAnalysis']";
	
	public static final String validation_FindDirevtion_txt="/html/body/div[13]/p";
	
	
	/*---------------------------------------Real Time Dashboard---------------------------------------------*/
	
	public static final String txt_WardName_RTD="(//label[text()='Ward Name '])[2]";
	
	public static final String txt_Group_RTD="//label[text()='Group :']";
	
	public static final String dd_WardName_RTD="//select[@id='ddlchartWardname']";
	
	public static final String dd_Group_RTD="//select[@id='ddlLayerChart']";
	
	public static final String btn_GO_RTD="(//button[@id='btngowardinfo'])[2]";
	
	public static final String btn_Collpase_Restore_RTD="/html/body/aside[10]/form/div[1]/div/button[1]";
	
	public static final String btn_close_RTD="/html/body/aside[10]/form/div[1]/div/button[2]";
	
	public static final String piechart_RTD="//div[@id='chartprint']";
	
	public static final String validation_txt_RTD="/html/body/div[12]/p";
	
	
	/*----------------------------------------------Feedback-------------------------------------------------*/
	
	
	public static final String txt_Name_Feedback="//*[text()='Name ']";
	public static final String txtbox_Name_Feedback="//input[@id='txtname']";
	
	public static final String txt_Address_Feedback="//*[text()='Address']";
	public static final String txtbox_Address_Feedback="//input[@id='txtaddress']";
	
	public static final String txt_City_Feedback="//*[text()='City']";
	public static final String txtbox_City_Feedback="//input[@id='txtcity']";
	
	public static final String txt_MobileNumber_Feedback="//*[text()='Mobile No.']";
	public static final String txtbox_MobileNumber_Feedback="//input[@id='txtcontactno']";
	
	public static final String txt_Email_Feedback="//*[text()='Email']";
	public static final String txtbox_Email_Feedback="//input[@id='txtemail']";
	
	public static final String txt_FeedbackDetails_Feedback="//*[text()='Feedback Details ']";
	public static final String txtbox_FeedbackDetails_Feedback="//textarea[@id='txtfeedback']";
	
	public static final String txt_FileUpload_Feedback="//*[text()='File Upload']";
	public static final String txtbox_FileUpload_Feedback="//input[@id='fileUpload']";
	
	public static final String txt_MapAttachment_Feedback="//*[text()='Map Attachment']";
	public static final String chckbox_MapAttachment_Feedback="//input[@id='MapPrint']";
	
	public static final String btn_Save_Feedback="(//button[text()='Save'])[1]";
	
	public static final String btn_Clear_Feedback="(//button[text()='Clear'])[1]";
	
	public static final String validation_txt_Feedback="/html/body/div[12]/p";
	
	
	/*----------------------------------------------Status Bar-------------------------------------------------*/
	
	public static final String WardName_StatusBar="//div[@id='statusbarmapinfo']";
	
	public static final String CurrentVersion_StatusBar="//div[@id='appversion']";

	
	
}
