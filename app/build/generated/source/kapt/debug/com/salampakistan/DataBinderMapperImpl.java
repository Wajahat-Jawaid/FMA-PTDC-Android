package com.salampakistan;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.salampakistan.databinding.ActivityOnboardingBindingImpl;
import com.salampakistan.databinding.BookingLayoutBindingImpl;
import com.salampakistan.databinding.BookingMenuItemBindingImpl;
import com.salampakistan.databinding.DialogFragmentListBindingImpl;
import com.salampakistan.databinding.DialogInputBindingImpl;
import com.salampakistan.databinding.DialogSimpleBindingImpl;
import com.salampakistan.databinding.DialogTwoBtnsBindingImpl;
import com.salampakistan.databinding.DialogVisaStatusBindingImpl;
import com.salampakistan.databinding.FeedbackBindingImpl;
import com.salampakistan.databinding.FormPlanBindingImpl;
import com.salampakistan.databinding.FragmentAboutBindingImpl;
import com.salampakistan.databinding.FragmentBookingBindingImpl;
import com.salampakistan.databinding.FragmentBusBookingSearchBindingImpl;
import com.salampakistan.databinding.FragmentBusListBindingImpl;
import com.salampakistan.databinding.FragmentCheckVisaStatusBindingImpl;
import com.salampakistan.databinding.FragmentContactBindingImpl;
import com.salampakistan.databinding.FragmentCurrencyBindingImpl;
import com.salampakistan.databinding.FragmentEventDetailsBindingImpl;
import com.salampakistan.databinding.FragmentEventListBindingImpl;
import com.salampakistan.databinding.FragmentFlightBookingBindingImpl;
import com.salampakistan.databinding.FragmentFlightListBindingImpl;
import com.salampakistan.databinding.FragmentForgotBindingImpl;
import com.salampakistan.databinding.FragmentHomeBindingImpl;
import com.salampakistan.databinding.FragmentHomeWhatToDoBindingImpl;
import com.salampakistan.databinding.FragmentHotelBookingBindingImpl;
import com.salampakistan.databinding.FragmentHotelBookingDetailsBindingImpl;
import com.salampakistan.databinding.FragmentHotelDetailsBindingImpl;
import com.salampakistan.databinding.FragmentHotelListBindingImpl;
import com.salampakistan.databinding.FragmentImageCarouselBindingImpl;
import com.salampakistan.databinding.FragmentImageViewBindingImpl;
import com.salampakistan.databinding.FragmentItinerariesBindingImpl;
import com.salampakistan.databinding.FragmentListBindingImpl;
import com.salampakistan.databinding.FragmentListWhatToDoBindingImpl;
import com.salampakistan.databinding.FragmentListWhatToDoCategoryBindingImpl;
import com.salampakistan.databinding.FragmentListWhereToGoBindingImpl;
import com.salampakistan.databinding.FragmentListWhereToGoCategoryBindingImpl;
import com.salampakistan.databinding.FragmentLocationDetailsBindingImpl;
import com.salampakistan.databinding.FragmentLoginBindingImpl;
import com.salampakistan.databinding.FragmentMapBindingImpl;
import com.salampakistan.databinding.FragmentPlanningBindingImpl;
import com.salampakistan.databinding.FragmentPoiBindingImpl;
import com.salampakistan.databinding.FragmentProfileBindingImpl;
import com.salampakistan.databinding.FragmentProfileOptionsBindingImpl;
import com.salampakistan.databinding.FragmentRegisterBindingImpl;
import com.salampakistan.databinding.FragmentSearchBindingImpl;
import com.salampakistan.databinding.FragmentSeasonDetailsBindingImpl;
import com.salampakistan.databinding.FragmentTrainBookingBindingImpl;
import com.salampakistan.databinding.FragmentTripDetailsBindingImpl;
import com.salampakistan.databinding.FragmentUpdateProfileBindingImpl;
import com.salampakistan.databinding.FragmentWeatherBindingImpl;
import com.salampakistan.databinding.IncChipViewBindingImpl;
import com.salampakistan.databinding.LayoutAmenitiesBindingImpl;
import com.salampakistan.databinding.LocationDetailsFragmentSkeletonBindingImpl;
import com.salampakistan.databinding.MenuBottomCameraBindingImpl;
import com.salampakistan.databinding.RowAmenitiesBindingImpl;
import com.salampakistan.databinding.RowBusBindingImpl;
import com.salampakistan.databinding.RowCarouselImageBindingImpl;
import com.salampakistan.databinding.RowEventBindingImpl;
import com.salampakistan.databinding.RowFacilityTextBindingImpl;
import com.salampakistan.databinding.RowFeaturedEventBindingImpl;
import com.salampakistan.databinding.RowFlightBindingImpl;
import com.salampakistan.databinding.RowHomeActivityBindingImpl;
import com.salampakistan.databinding.RowHomeBlogBindingImpl;
import com.salampakistan.databinding.RowHomeLocationBindingImpl;
import com.salampakistan.databinding.RowHomeLocationSkeletonBindingImpl;
import com.salampakistan.databinding.RowHomeSeasonBindingImpl;
import com.salampakistan.databinding.RowHomeTripBindingImpl;
import com.salampakistan.databinding.RowHomeTripSkeletonBindingImpl;
import com.salampakistan.databinding.RowHotelListBindingImpl;
import com.salampakistan.databinding.RowItineraryBindingImpl;
import com.salampakistan.databinding.RowListSkeletonBindingImpl;
import com.salampakistan.databinding.RowMapPoiBindingImpl;
import com.salampakistan.databinding.RowPlanningBindingImpl;
import com.salampakistan.databinding.RowPoiListBindingImpl;
import com.salampakistan.databinding.RowPropertyListBindingImpl;
import com.salampakistan.databinding.RowRadioListBindingImpl;
import com.salampakistan.databinding.RowRelatedEventBindingImpl;
import com.salampakistan.databinding.RowRelatedLocationBindingImpl;
import com.salampakistan.databinding.RowReviewBindingImpl;
import com.salampakistan.databinding.RowRoomPhotoBindingImpl;
import com.salampakistan.databinding.RowSeasonFestivityBindingImpl;
import com.salampakistan.databinding.RowServicesBindingImpl;
import com.salampakistan.databinding.RowWhatToDoBindingImpl;
import com.salampakistan.databinding.RowWhereToGoBindingImpl;
import com.salampakistan.databinding.RowWhereToGoTypeAllBindingImpl;
import com.salampakistan.databinding.RowWishlistBindingImpl;
import com.salampakistan.databinding.RowWishlistSkeletonBindingImpl;
import com.salampakistan.databinding.SortBottomSheetBindingImpl;
import com.salampakistan.databinding.UpdatePasswordFragmentBindingImpl;
import com.salampakistan.databinding.ViewBackBtnBindingImpl;
import com.salampakistan.databinding.ViewBackBtnBlackBindingImpl;
import com.salampakistan.databinding.ViewCounterWidgetBindingImpl;
import com.salampakistan.databinding.ViewHomeFragmentContainerBindingImpl;
import com.salampakistan.databinding.ViewProfileOptionBindingImpl;
import com.salampakistan.databinding.ViewRatingBarBindingImpl;
import com.salampakistan.databinding.ViewSearchToolbarBindingImpl;
import com.salampakistan.databinding.X1BindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYONBOARDING = 1;

  private static final int LAYOUT_BOOKINGLAYOUT = 2;

  private static final int LAYOUT_BOOKINGMENUITEM = 3;

  private static final int LAYOUT_DIALOGFRAGMENTLIST = 4;

  private static final int LAYOUT_DIALOGINPUT = 5;

  private static final int LAYOUT_DIALOGSIMPLE = 6;

  private static final int LAYOUT_DIALOGTWOBTNS = 7;

  private static final int LAYOUT_DIALOGVISASTATUS = 8;

  private static final int LAYOUT_FEEDBACK = 9;

  private static final int LAYOUT_FORMPLAN = 10;

  private static final int LAYOUT_FRAGMENTABOUT = 11;

  private static final int LAYOUT_FRAGMENTBOOKING = 12;

  private static final int LAYOUT_FRAGMENTBUSBOOKINGSEARCH = 13;

  private static final int LAYOUT_FRAGMENTBUSLIST = 14;

  private static final int LAYOUT_FRAGMENTCHECKVISASTATUS = 15;

  private static final int LAYOUT_FRAGMENTCONTACT = 16;

  private static final int LAYOUT_FRAGMENTCURRENCY = 17;

  private static final int LAYOUT_FRAGMENTEVENTDETAILS = 18;

  private static final int LAYOUT_FRAGMENTEVENTLIST = 19;

  private static final int LAYOUT_FRAGMENTFLIGHTBOOKING = 20;

  private static final int LAYOUT_FRAGMENTFLIGHTLIST = 21;

  private static final int LAYOUT_FRAGMENTFORGOT = 22;

  private static final int LAYOUT_FRAGMENTHOME = 23;

  private static final int LAYOUT_FRAGMENTHOMEWHATTODO = 24;

  private static final int LAYOUT_FRAGMENTHOTELBOOKING = 25;

  private static final int LAYOUT_FRAGMENTHOTELBOOKINGDETAILS = 26;

  private static final int LAYOUT_FRAGMENTHOTELDETAILS = 27;

  private static final int LAYOUT_FRAGMENTHOTELLIST = 28;

  private static final int LAYOUT_FRAGMENTIMAGECAROUSEL = 29;

  private static final int LAYOUT_FRAGMENTIMAGEVIEW = 30;

  private static final int LAYOUT_FRAGMENTITINERARIES = 31;

  private static final int LAYOUT_FRAGMENTLIST = 32;

  private static final int LAYOUT_FRAGMENTLISTWHATTODO = 33;

  private static final int LAYOUT_FRAGMENTLISTWHATTODOCATEGORY = 34;

  private static final int LAYOUT_FRAGMENTLISTWHERETOGO = 35;

  private static final int LAYOUT_FRAGMENTLISTWHERETOGOCATEGORY = 36;

  private static final int LAYOUT_FRAGMENTLOCATIONDETAILS = 37;

  private static final int LAYOUT_FRAGMENTLOGIN = 38;

  private static final int LAYOUT_FRAGMENTMAP = 39;

  private static final int LAYOUT_FRAGMENTPLANNING = 40;

  private static final int LAYOUT_FRAGMENTPOI = 41;

  private static final int LAYOUT_FRAGMENTPROFILE = 42;

  private static final int LAYOUT_FRAGMENTPROFILEOPTIONS = 43;

  private static final int LAYOUT_FRAGMENTREGISTER = 44;

  private static final int LAYOUT_FRAGMENTSEARCH = 45;

  private static final int LAYOUT_FRAGMENTSEASONDETAILS = 46;

  private static final int LAYOUT_FRAGMENTTRAINBOOKING = 47;

  private static final int LAYOUT_FRAGMENTTRIPDETAILS = 48;

  private static final int LAYOUT_FRAGMENTUPDATEPROFILE = 49;

  private static final int LAYOUT_FRAGMENTWEATHER = 50;

  private static final int LAYOUT_INCCHIPVIEW = 51;

  private static final int LAYOUT_LAYOUTAMENITIES = 52;

  private static final int LAYOUT_LOCATIONDETAILSFRAGMENTSKELETON = 53;

  private static final int LAYOUT_MENUBOTTOMCAMERA = 54;

  private static final int LAYOUT_ROWAMENITIES = 55;

  private static final int LAYOUT_ROWBUS = 56;

  private static final int LAYOUT_ROWCAROUSELIMAGE = 57;

  private static final int LAYOUT_ROWEVENT = 58;

  private static final int LAYOUT_ROWFACILITYTEXT = 59;

  private static final int LAYOUT_ROWFEATUREDEVENT = 60;

  private static final int LAYOUT_ROWFLIGHT = 61;

  private static final int LAYOUT_ROWHOMEACTIVITY = 62;

  private static final int LAYOUT_ROWHOMEBLOG = 63;

  private static final int LAYOUT_ROWHOMELOCATION = 64;

  private static final int LAYOUT_ROWHOMELOCATIONSKELETON = 65;

  private static final int LAYOUT_ROWHOMESEASON = 66;

  private static final int LAYOUT_ROWHOMETRIP = 67;

  private static final int LAYOUT_ROWHOMETRIPSKELETON = 68;

  private static final int LAYOUT_ROWHOTELLIST = 69;

  private static final int LAYOUT_ROWITINERARY = 70;

  private static final int LAYOUT_ROWLISTSKELETON = 71;

  private static final int LAYOUT_ROWMAPPOI = 72;

  private static final int LAYOUT_ROWPLANNING = 73;

  private static final int LAYOUT_ROWPOILIST = 74;

  private static final int LAYOUT_ROWPROPERTYLIST = 75;

  private static final int LAYOUT_ROWRADIOLIST = 76;

  private static final int LAYOUT_ROWRELATEDEVENT = 77;

  private static final int LAYOUT_ROWRELATEDLOCATION = 78;

  private static final int LAYOUT_ROWREVIEW = 79;

  private static final int LAYOUT_ROWROOMPHOTO = 80;

  private static final int LAYOUT_ROWSEASONFESTIVITY = 81;

  private static final int LAYOUT_ROWSERVICES = 82;

  private static final int LAYOUT_ROWWHATTODO = 83;

  private static final int LAYOUT_ROWWHERETOGO = 84;

  private static final int LAYOUT_ROWWHERETOGOTYPEALL = 85;

  private static final int LAYOUT_ROWWISHLIST = 86;

  private static final int LAYOUT_ROWWISHLISTSKELETON = 87;

  private static final int LAYOUT_SORTBOTTOMSHEET = 88;

  private static final int LAYOUT_UPDATEPASSWORDFRAGMENT = 89;

  private static final int LAYOUT_VIEWBACKBTN = 90;

  private static final int LAYOUT_VIEWBACKBTNBLACK = 91;

  private static final int LAYOUT_VIEWCOUNTERWIDGET = 92;

  private static final int LAYOUT_VIEWHOMEFRAGMENTCONTAINER = 93;

  private static final int LAYOUT_VIEWPROFILEOPTION = 94;

  private static final int LAYOUT_VIEWRATINGBAR = 95;

  private static final int LAYOUT_VIEWSEARCHTOOLBAR = 96;

  private static final int LAYOUT_X1 = 97;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(97);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.activity_onboarding, LAYOUT_ACTIVITYONBOARDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.booking_layout, LAYOUT_BOOKINGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.booking_menu_item, LAYOUT_BOOKINGMENUITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.dialog_fragment_list, LAYOUT_DIALOGFRAGMENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.dialog_input, LAYOUT_DIALOGINPUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.dialog_simple, LAYOUT_DIALOGSIMPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.dialog_two_btns, LAYOUT_DIALOGTWOBTNS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.dialog_visa_status, LAYOUT_DIALOGVISASTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.feedback, LAYOUT_FEEDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.form_plan, LAYOUT_FORMPLAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_booking, LAYOUT_FRAGMENTBOOKING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_bus_booking_search, LAYOUT_FRAGMENTBUSBOOKINGSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_bus_list, LAYOUT_FRAGMENTBUSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_check_visa_status, LAYOUT_FRAGMENTCHECKVISASTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_contact, LAYOUT_FRAGMENTCONTACT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_currency, LAYOUT_FRAGMENTCURRENCY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_event_details, LAYOUT_FRAGMENTEVENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_event_list, LAYOUT_FRAGMENTEVENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_flight_booking, LAYOUT_FRAGMENTFLIGHTBOOKING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_flight_list, LAYOUT_FRAGMENTFLIGHTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_forgot, LAYOUT_FRAGMENTFORGOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_home_what_to_do, LAYOUT_FRAGMENTHOMEWHATTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_hotel_booking, LAYOUT_FRAGMENTHOTELBOOKING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_hotel_booking_details, LAYOUT_FRAGMENTHOTELBOOKINGDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_hotel_details, LAYOUT_FRAGMENTHOTELDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_hotel_list, LAYOUT_FRAGMENTHOTELLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_image_carousel, LAYOUT_FRAGMENTIMAGECAROUSEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_image_view, LAYOUT_FRAGMENTIMAGEVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_itineraries, LAYOUT_FRAGMENTITINERARIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_list, LAYOUT_FRAGMENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_list_what_to_do, LAYOUT_FRAGMENTLISTWHATTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_list_what_to_do_category, LAYOUT_FRAGMENTLISTWHATTODOCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_list_where_to_go, LAYOUT_FRAGMENTLISTWHERETOGO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_list_where_to_go_category, LAYOUT_FRAGMENTLISTWHERETOGOCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_location_details, LAYOUT_FRAGMENTLOCATIONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_planning, LAYOUT_FRAGMENTPLANNING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_poi, LAYOUT_FRAGMENTPOI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_profile_options, LAYOUT_FRAGMENTPROFILEOPTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_season_details, LAYOUT_FRAGMENTSEASONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_train_booking, LAYOUT_FRAGMENTTRAINBOOKING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_trip_details, LAYOUT_FRAGMENTTRIPDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_update_profile, LAYOUT_FRAGMENTUPDATEPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.fragment_weather, LAYOUT_FRAGMENTWEATHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.inc_chip_view, LAYOUT_INCCHIPVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.layout_amenities, LAYOUT_LAYOUTAMENITIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.location_details_fragment_skeleton, LAYOUT_LOCATIONDETAILSFRAGMENTSKELETON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.menu_bottom_camera, LAYOUT_MENUBOTTOMCAMERA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_amenities, LAYOUT_ROWAMENITIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_bus, LAYOUT_ROWBUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_carousel_image, LAYOUT_ROWCAROUSELIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_event, LAYOUT_ROWEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_facility_text, LAYOUT_ROWFACILITYTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_featured_event, LAYOUT_ROWFEATUREDEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_flight, LAYOUT_ROWFLIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_home_activity, LAYOUT_ROWHOMEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_home_blog, LAYOUT_ROWHOMEBLOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_home_location, LAYOUT_ROWHOMELOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_home_location_skeleton, LAYOUT_ROWHOMELOCATIONSKELETON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_home_season, LAYOUT_ROWHOMESEASON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_home_trip, LAYOUT_ROWHOMETRIP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_home_trip_skeleton, LAYOUT_ROWHOMETRIPSKELETON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_hotel_list, LAYOUT_ROWHOTELLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_itinerary, LAYOUT_ROWITINERARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_list_skeleton, LAYOUT_ROWLISTSKELETON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_map_poi, LAYOUT_ROWMAPPOI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_planning, LAYOUT_ROWPLANNING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_poi_list, LAYOUT_ROWPOILIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_property_list, LAYOUT_ROWPROPERTYLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_radio_list, LAYOUT_ROWRADIOLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_related_event, LAYOUT_ROWRELATEDEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_related_location, LAYOUT_ROWRELATEDLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_review, LAYOUT_ROWREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_room_photo, LAYOUT_ROWROOMPHOTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_season_festivity, LAYOUT_ROWSEASONFESTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_services, LAYOUT_ROWSERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_what_to_do, LAYOUT_ROWWHATTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_where_to_go, LAYOUT_ROWWHERETOGO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_where_to_go_type_all, LAYOUT_ROWWHERETOGOTYPEALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_wishlist, LAYOUT_ROWWISHLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.row_wishlist_skeleton, LAYOUT_ROWWISHLISTSKELETON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.sort_bottom_sheet, LAYOUT_SORTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.update_password_fragment, LAYOUT_UPDATEPASSWORDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.view_back_btn, LAYOUT_VIEWBACKBTN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.view_back_btn_black, LAYOUT_VIEWBACKBTNBLACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.view_counter_widget, LAYOUT_VIEWCOUNTERWIDGET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.view_home_fragment_container, LAYOUT_VIEWHOMEFRAGMENTCONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.view_profile_option, LAYOUT_VIEWPROFILEOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.view_rating_bar, LAYOUT_VIEWRATINGBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.view_search_toolbar, LAYOUT_VIEWSEARCHTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.salampakistan.R.layout.x1, LAYOUT_X1);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYONBOARDING: {
        if ("layout/activity_onboarding_0".equals(tag)) {
          return new ActivityOnboardingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_onboarding is invalid. Received: " + tag);
      }
      case  LAYOUT_BOOKINGLAYOUT: {
        if ("layout/booking_layout_0".equals(tag)) {
          return new BookingLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for booking_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_BOOKINGMENUITEM: {
        if ("layout/booking_menu_item_0".equals(tag)) {
          return new BookingMenuItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for booking_menu_item is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGFRAGMENTLIST: {
        if ("layout/dialog_fragment_list_0".equals(tag)) {
          return new DialogFragmentListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_fragment_list is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGINPUT: {
        if ("layout/dialog_input_0".equals(tag)) {
          return new DialogInputBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_input is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGSIMPLE: {
        if ("layout/dialog_simple_0".equals(tag)) {
          return new DialogSimpleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_simple is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGTWOBTNS: {
        if ("layout/dialog_two_btns_0".equals(tag)) {
          return new DialogTwoBtnsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_two_btns is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGVISASTATUS: {
        if ("layout/dialog_visa_status_0".equals(tag)) {
          return new DialogVisaStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_visa_status is invalid. Received: " + tag);
      }
      case  LAYOUT_FEEDBACK: {
        if ("layout/feedback_0".equals(tag)) {
          return new FeedbackBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for feedback is invalid. Received: " + tag);
      }
      case  LAYOUT_FORMPLAN: {
        if ("layout/form_plan_0".equals(tag)) {
          return new FormPlanBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for form_plan is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTABOUT: {
        if ("layout/fragment_about_0".equals(tag)) {
          return new FragmentAboutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBOOKING: {
        if ("layout/fragment_booking_0".equals(tag)) {
          return new FragmentBookingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_booking is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBUSBOOKINGSEARCH: {
        if ("layout/fragment_bus_booking_search_0".equals(tag)) {
          return new FragmentBusBookingSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_bus_booking_search is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTBUSLIST: {
        if ("layout/fragment_bus_list_0".equals(tag)) {
          return new FragmentBusListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_bus_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHECKVISASTATUS: {
        if ("layout/fragment_check_visa_status_0".equals(tag)) {
          return new FragmentCheckVisaStatusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_check_visa_status is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONTACT: {
        if ("layout/fragment_contact_0".equals(tag)) {
          return new FragmentContactBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_contact is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCURRENCY: {
        if ("layout/fragment_currency_0".equals(tag)) {
          return new FragmentCurrencyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_currency is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEVENTDETAILS: {
        if ("layout/fragment_event_details_0".equals(tag)) {
          return new FragmentEventDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_event_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEVENTLIST: {
        if ("layout/fragment_event_list_0".equals(tag)) {
          return new FragmentEventListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_event_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFLIGHTBOOKING: {
        if ("layout/fragment_flight_booking_0".equals(tag)) {
          return new FragmentFlightBookingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_flight_booking is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFLIGHTLIST: {
        if ("layout/fragment_flight_list_0".equals(tag)) {
          return new FragmentFlightListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_flight_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFORGOT: {
        if ("layout/fragment_forgot_0".equals(tag)) {
          return new FragmentForgotBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_forgot is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOMEWHATTODO: {
        if ("layout/fragment_home_what_to_do_0".equals(tag)) {
          return new FragmentHomeWhatToDoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home_what_to_do is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOTELBOOKING: {
        if ("layout/fragment_hotel_booking_0".equals(tag)) {
          return new FragmentHotelBookingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_hotel_booking is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOTELBOOKINGDETAILS: {
        if ("layout/fragment_hotel_booking_details_0".equals(tag)) {
          return new FragmentHotelBookingDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_hotel_booking_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOTELDETAILS: {
        if ("layout/fragment_hotel_details_0".equals(tag)) {
          return new FragmentHotelDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_hotel_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOTELLIST: {
        if ("layout/fragment_hotel_list_0".equals(tag)) {
          return new FragmentHotelListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_hotel_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTIMAGECAROUSEL: {
        if ("layout/fragment_image_carousel_0".equals(tag)) {
          return new FragmentImageCarouselBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_image_carousel is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTIMAGEVIEW: {
        if ("layout/fragment_image_view_0".equals(tag)) {
          return new FragmentImageViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_image_view is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTITINERARIES: {
        if ("layout/fragment_itineraries_0".equals(tag)) {
          return new FragmentItinerariesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_itineraries is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLIST: {
        if ("layout/fragment_list_0".equals(tag)) {
          return new FragmentListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTWHATTODO: {
        if ("layout/fragment_list_what_to_do_0".equals(tag)) {
          return new FragmentListWhatToDoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_what_to_do is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTWHATTODOCATEGORY: {
        if ("layout/fragment_list_what_to_do_category_0".equals(tag)) {
          return new FragmentListWhatToDoCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_what_to_do_category is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTWHERETOGO: {
        if ("layout/fragment_list_where_to_go_0".equals(tag)) {
          return new FragmentListWhereToGoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_where_to_go is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTWHERETOGOCATEGORY: {
        if ("layout/fragment_list_where_to_go_category_0".equals(tag)) {
          return new FragmentListWhereToGoCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_where_to_go_category is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOCATIONDETAILS: {
        if ("layout/fragment_location_details_0".equals(tag)) {
          return new FragmentLocationDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_location_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGIN: {
        if ("layout/fragment_login_0".equals(tag)) {
          return new FragmentLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMAP: {
        if ("layout/fragment_map_0".equals(tag)) {
          return new FragmentMapBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPLANNING: {
        if ("layout/fragment_planning_0".equals(tag)) {
          return new FragmentPlanningBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_planning is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPOI: {
        if ("layout/fragment_poi_0".equals(tag)) {
          return new FragmentPoiBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_poi is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILEOPTIONS: {
        if ("layout/fragment_profile_options_0".equals(tag)) {
          return new FragmentProfileOptionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile_options is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTER: {
        if ("layout/fragment_register_0".equals(tag)) {
          return new FragmentRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEARCH: {
        if ("layout/fragment_search_0".equals(tag)) {
          return new FragmentSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEASONDETAILS: {
        if ("layout/fragment_season_details_0".equals(tag)) {
          return new FragmentSeasonDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_season_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTRAINBOOKING: {
        if ("layout/fragment_train_booking_0".equals(tag)) {
          return new FragmentTrainBookingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_train_booking is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTRIPDETAILS: {
        if ("layout/fragment_trip_details_0".equals(tag)) {
          return new FragmentTripDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_trip_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUPDATEPROFILE: {
        if ("layout/fragment_update_profile_0".equals(tag)) {
          return new FragmentUpdateProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_update_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTWEATHER: {
        if ("layout/fragment_weather_0".equals(tag)) {
          return new FragmentWeatherBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_weather is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_INCCHIPVIEW: {
        if ("layout/inc_chip_view_0".equals(tag)) {
          return new IncChipViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for inc_chip_view is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTAMENITIES: {
        if ("layout/layout_amenities_0".equals(tag)) {
          return new LayoutAmenitiesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_amenities is invalid. Received: " + tag);
      }
      case  LAYOUT_LOCATIONDETAILSFRAGMENTSKELETON: {
        if ("layout/location_details_fragment_skeleton_0".equals(tag)) {
          return new LocationDetailsFragmentSkeletonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for location_details_fragment_skeleton is invalid. Received: " + tag);
      }
      case  LAYOUT_MENUBOTTOMCAMERA: {
        if ("layout/menu_bottom_camera_0".equals(tag)) {
          return new MenuBottomCameraBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for menu_bottom_camera is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWAMENITIES: {
        if ("layout/row_amenities_0".equals(tag)) {
          return new RowAmenitiesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_amenities is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWBUS: {
        if ("layout/row_bus_0".equals(tag)) {
          return new RowBusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_bus is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWCAROUSELIMAGE: {
        if ("layout/row_carousel_image_0".equals(tag)) {
          return new RowCarouselImageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_carousel_image is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWEVENT: {
        if ("layout/row_event_0".equals(tag)) {
          return new RowEventBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_event is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWFACILITYTEXT: {
        if ("layout/row_facility_text_0".equals(tag)) {
          return new RowFacilityTextBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_facility_text is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWFEATUREDEVENT: {
        if ("layout/row_featured_event_0".equals(tag)) {
          return new RowFeaturedEventBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_featured_event is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWFLIGHT: {
        if ("layout/row_flight_0".equals(tag)) {
          return new RowFlightBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_flight is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOMEACTIVITY: {
        if ("layout/row_home_activity_0".equals(tag)) {
          return new RowHomeActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_home_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOMEBLOG: {
        if ("layout/row_home_blog_0".equals(tag)) {
          return new RowHomeBlogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_home_blog is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOMELOCATION: {
        if ("layout/row_home_location_0".equals(tag)) {
          return new RowHomeLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_home_location is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOMELOCATIONSKELETON: {
        if ("layout/row_home_location_skeleton_0".equals(tag)) {
          return new RowHomeLocationSkeletonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_home_location_skeleton is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOMESEASON: {
        if ("layout/row_home_season_0".equals(tag)) {
          return new RowHomeSeasonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_home_season is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOMETRIP: {
        if ("layout/row_home_trip_0".equals(tag)) {
          return new RowHomeTripBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_home_trip is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOMETRIPSKELETON: {
        if ("layout/row_home_trip_skeleton_0".equals(tag)) {
          return new RowHomeTripSkeletonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_home_trip_skeleton is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWHOTELLIST: {
        if ("layout/row_hotel_list_0".equals(tag)) {
          return new RowHotelListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_hotel_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITINERARY: {
        if ("layout/row_itinerary_0".equals(tag)) {
          return new RowItineraryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_itinerary is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWLISTSKELETON: {
        if ("layout/row_list_skeleton_0".equals(tag)) {
          return new RowListSkeletonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_list_skeleton is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWMAPPOI: {
        if ("layout/row_map_poi_0".equals(tag)) {
          return new RowMapPoiBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_map_poi is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLANNING: {
        if ("layout/row_planning_0".equals(tag)) {
          return new RowPlanningBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_planning is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPOILIST: {
        if ("layout/row_poi_list_0".equals(tag)) {
          return new RowPoiListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_poi_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPROPERTYLIST: {
        if ("layout/row_property_list_0".equals(tag)) {
          return new RowPropertyListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_property_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWRADIOLIST: {
        if ("layout/row_radio_list_0".equals(tag)) {
          return new RowRadioListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_radio_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWRELATEDEVENT: {
        if ("layout/row_related_event_0".equals(tag)) {
          return new RowRelatedEventBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_related_event is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWRELATEDLOCATION: {
        if ("layout/row_related_location_0".equals(tag)) {
          return new RowRelatedLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_related_location is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWREVIEW: {
        if ("layout/row_review_0".equals(tag)) {
          return new RowReviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_review is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWROOMPHOTO: {
        if ("layout/row_room_photo_0".equals(tag)) {
          return new RowRoomPhotoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_room_photo is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWSEASONFESTIVITY: {
        if ("layout/row_season_festivity_0".equals(tag)) {
          return new RowSeasonFestivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_season_festivity is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWSERVICES: {
        if ("layout/row_services_0".equals(tag)) {
          return new RowServicesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_services is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWWHATTODO: {
        if ("layout/row_what_to_do_0".equals(tag)) {
          return new RowWhatToDoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_what_to_do is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWWHERETOGO: {
        if ("layout/row_where_to_go_0".equals(tag)) {
          return new RowWhereToGoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_where_to_go is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWWHERETOGOTYPEALL: {
        if ("layout/row_where_to_go_type_all_0".equals(tag)) {
          return new RowWhereToGoTypeAllBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_where_to_go_type_all is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWWISHLIST: {
        if ("layout/row_wishlist_0".equals(tag)) {
          return new RowWishlistBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_wishlist is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWWISHLISTSKELETON: {
        if ("layout/row_wishlist_skeleton_0".equals(tag)) {
          return new RowWishlistSkeletonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_wishlist_skeleton is invalid. Received: " + tag);
      }
      case  LAYOUT_SORTBOTTOMSHEET: {
        if ("layout/sort_bottom_sheet_0".equals(tag)) {
          return new SortBottomSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for sort_bottom_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_UPDATEPASSWORDFRAGMENT: {
        if ("layout/update_password_fragment_0".equals(tag)) {
          return new UpdatePasswordFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for update_password_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWBACKBTN: {
        if ("layout/view_back_btn_0".equals(tag)) {
          return new ViewBackBtnBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_back_btn is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWBACKBTNBLACK: {
        if ("layout/view_back_btn_black_0".equals(tag)) {
          return new ViewBackBtnBlackBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_back_btn_black is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWCOUNTERWIDGET: {
        if ("layout/view_counter_widget_0".equals(tag)) {
          return new ViewCounterWidgetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_counter_widget is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWHOMEFRAGMENTCONTAINER: {
        if ("layout/view_home_fragment_container_0".equals(tag)) {
          return new ViewHomeFragmentContainerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_home_fragment_container is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWPROFILEOPTION: {
        if ("layout/view_profile_option_0".equals(tag)) {
          return new ViewProfileOptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_profile_option is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWRATINGBAR: {
        if ("layout/view_rating_bar_0".equals(tag)) {
          return new ViewRatingBarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_rating_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_VIEWSEARCHTOOLBAR: {
        if ("layout/view_search_toolbar_0".equals(tag)) {
          return new ViewSearchToolbarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for view_search_toolbar is invalid. Received: " + tag);
      }
      case  LAYOUT_X1: {
        if ("layout/x1_0".equals(tag)) {
          return new X1BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for x1 is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(37);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "country");
      sKeys.put(2, "arrival");
      sKeys.put(3, "categoryLocation");
      sKeys.put(4, "icon");
      sKeys.put(5, "showSeeAllText");
      sKeys.put(6, "title");
      sKeys.put(7, "type");
      sKeys.put(8, "intro");
      sKeys.put(9, "temperature");
      sKeys.put(10, "model");
      sKeys.put(11, "text");
      sKeys.put(12, "event");
      sKeys.put(13, "amount");
      sKeys.put(14, "thumbnail");
      sKeys.put(15, "marginStart");
      sKeys.put(16, "isLastItem");
      sKeys.put(17, "count");
      sKeys.put(18, "index");
      sKeys.put(19, "imgUrl");
      sKeys.put(20, "fragment");
      sKeys.put(21, "moreCount");
      sKeys.put(22, "blackTint");
      sKeys.put(23, "marginEnd");
      sKeys.put(24, "name");
      sKeys.put(25, "online");
      sKeys.put(26, "viewModel");
      sKeys.put(27, "festivity");
      sKeys.put(28, "progress");
      sKeys.put(29, "location");
      sKeys.put(30, "marginBottom");
      sKeys.put(31, "user");
      sKeys.put(32, "categoryActivity");
      sKeys.put(33, "marginTop");
      sKeys.put(34, "cancellationPolicy");
      sKeys.put(35, "desc");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(97);

    static {
      sKeys.put("layout/activity_onboarding_0", com.salampakistan.R.layout.activity_onboarding);
      sKeys.put("layout/booking_layout_0", com.salampakistan.R.layout.booking_layout);
      sKeys.put("layout/booking_menu_item_0", com.salampakistan.R.layout.booking_menu_item);
      sKeys.put("layout/dialog_fragment_list_0", com.salampakistan.R.layout.dialog_fragment_list);
      sKeys.put("layout/dialog_input_0", com.salampakistan.R.layout.dialog_input);
      sKeys.put("layout/dialog_simple_0", com.salampakistan.R.layout.dialog_simple);
      sKeys.put("layout/dialog_two_btns_0", com.salampakistan.R.layout.dialog_two_btns);
      sKeys.put("layout/dialog_visa_status_0", com.salampakistan.R.layout.dialog_visa_status);
      sKeys.put("layout/feedback_0", com.salampakistan.R.layout.feedback);
      sKeys.put("layout/form_plan_0", com.salampakistan.R.layout.form_plan);
      sKeys.put("layout/fragment_about_0", com.salampakistan.R.layout.fragment_about);
      sKeys.put("layout/fragment_booking_0", com.salampakistan.R.layout.fragment_booking);
      sKeys.put("layout/fragment_bus_booking_search_0", com.salampakistan.R.layout.fragment_bus_booking_search);
      sKeys.put("layout/fragment_bus_list_0", com.salampakistan.R.layout.fragment_bus_list);
      sKeys.put("layout/fragment_check_visa_status_0", com.salampakistan.R.layout.fragment_check_visa_status);
      sKeys.put("layout/fragment_contact_0", com.salampakistan.R.layout.fragment_contact);
      sKeys.put("layout/fragment_currency_0", com.salampakistan.R.layout.fragment_currency);
      sKeys.put("layout/fragment_event_details_0", com.salampakistan.R.layout.fragment_event_details);
      sKeys.put("layout/fragment_event_list_0", com.salampakistan.R.layout.fragment_event_list);
      sKeys.put("layout/fragment_flight_booking_0", com.salampakistan.R.layout.fragment_flight_booking);
      sKeys.put("layout/fragment_flight_list_0", com.salampakistan.R.layout.fragment_flight_list);
      sKeys.put("layout/fragment_forgot_0", com.salampakistan.R.layout.fragment_forgot);
      sKeys.put("layout/fragment_home_0", com.salampakistan.R.layout.fragment_home);
      sKeys.put("layout/fragment_home_what_to_do_0", com.salampakistan.R.layout.fragment_home_what_to_do);
      sKeys.put("layout/fragment_hotel_booking_0", com.salampakistan.R.layout.fragment_hotel_booking);
      sKeys.put("layout/fragment_hotel_booking_details_0", com.salampakistan.R.layout.fragment_hotel_booking_details);
      sKeys.put("layout/fragment_hotel_details_0", com.salampakistan.R.layout.fragment_hotel_details);
      sKeys.put("layout/fragment_hotel_list_0", com.salampakistan.R.layout.fragment_hotel_list);
      sKeys.put("layout/fragment_image_carousel_0", com.salampakistan.R.layout.fragment_image_carousel);
      sKeys.put("layout/fragment_image_view_0", com.salampakistan.R.layout.fragment_image_view);
      sKeys.put("layout/fragment_itineraries_0", com.salampakistan.R.layout.fragment_itineraries);
      sKeys.put("layout/fragment_list_0", com.salampakistan.R.layout.fragment_list);
      sKeys.put("layout/fragment_list_what_to_do_0", com.salampakistan.R.layout.fragment_list_what_to_do);
      sKeys.put("layout/fragment_list_what_to_do_category_0", com.salampakistan.R.layout.fragment_list_what_to_do_category);
      sKeys.put("layout/fragment_list_where_to_go_0", com.salampakistan.R.layout.fragment_list_where_to_go);
      sKeys.put("layout/fragment_list_where_to_go_category_0", com.salampakistan.R.layout.fragment_list_where_to_go_category);
      sKeys.put("layout/fragment_location_details_0", com.salampakistan.R.layout.fragment_location_details);
      sKeys.put("layout/fragment_login_0", com.salampakistan.R.layout.fragment_login);
      sKeys.put("layout/fragment_map_0", com.salampakistan.R.layout.fragment_map);
      sKeys.put("layout/fragment_planning_0", com.salampakistan.R.layout.fragment_planning);
      sKeys.put("layout/fragment_poi_0", com.salampakistan.R.layout.fragment_poi);
      sKeys.put("layout/fragment_profile_0", com.salampakistan.R.layout.fragment_profile);
      sKeys.put("layout/fragment_profile_options_0", com.salampakistan.R.layout.fragment_profile_options);
      sKeys.put("layout/fragment_register_0", com.salampakistan.R.layout.fragment_register);
      sKeys.put("layout/fragment_search_0", com.salampakistan.R.layout.fragment_search);
      sKeys.put("layout/fragment_season_details_0", com.salampakistan.R.layout.fragment_season_details);
      sKeys.put("layout/fragment_train_booking_0", com.salampakistan.R.layout.fragment_train_booking);
      sKeys.put("layout/fragment_trip_details_0", com.salampakistan.R.layout.fragment_trip_details);
      sKeys.put("layout/fragment_update_profile_0", com.salampakistan.R.layout.fragment_update_profile);
      sKeys.put("layout/fragment_weather_0", com.salampakistan.R.layout.fragment_weather);
      sKeys.put("layout/inc_chip_view_0", com.salampakistan.R.layout.inc_chip_view);
      sKeys.put("layout/layout_amenities_0", com.salampakistan.R.layout.layout_amenities);
      sKeys.put("layout/location_details_fragment_skeleton_0", com.salampakistan.R.layout.location_details_fragment_skeleton);
      sKeys.put("layout/menu_bottom_camera_0", com.salampakistan.R.layout.menu_bottom_camera);
      sKeys.put("layout/row_amenities_0", com.salampakistan.R.layout.row_amenities);
      sKeys.put("layout/row_bus_0", com.salampakistan.R.layout.row_bus);
      sKeys.put("layout/row_carousel_image_0", com.salampakistan.R.layout.row_carousel_image);
      sKeys.put("layout/row_event_0", com.salampakistan.R.layout.row_event);
      sKeys.put("layout/row_facility_text_0", com.salampakistan.R.layout.row_facility_text);
      sKeys.put("layout/row_featured_event_0", com.salampakistan.R.layout.row_featured_event);
      sKeys.put("layout/row_flight_0", com.salampakistan.R.layout.row_flight);
      sKeys.put("layout/row_home_activity_0", com.salampakistan.R.layout.row_home_activity);
      sKeys.put("layout/row_home_blog_0", com.salampakistan.R.layout.row_home_blog);
      sKeys.put("layout/row_home_location_0", com.salampakistan.R.layout.row_home_location);
      sKeys.put("layout/row_home_location_skeleton_0", com.salampakistan.R.layout.row_home_location_skeleton);
      sKeys.put("layout/row_home_season_0", com.salampakistan.R.layout.row_home_season);
      sKeys.put("layout/row_home_trip_0", com.salampakistan.R.layout.row_home_trip);
      sKeys.put("layout/row_home_trip_skeleton_0", com.salampakistan.R.layout.row_home_trip_skeleton);
      sKeys.put("layout/row_hotel_list_0", com.salampakistan.R.layout.row_hotel_list);
      sKeys.put("layout/row_itinerary_0", com.salampakistan.R.layout.row_itinerary);
      sKeys.put("layout/row_list_skeleton_0", com.salampakistan.R.layout.row_list_skeleton);
      sKeys.put("layout/row_map_poi_0", com.salampakistan.R.layout.row_map_poi);
      sKeys.put("layout/row_planning_0", com.salampakistan.R.layout.row_planning);
      sKeys.put("layout/row_poi_list_0", com.salampakistan.R.layout.row_poi_list);
      sKeys.put("layout/row_property_list_0", com.salampakistan.R.layout.row_property_list);
      sKeys.put("layout/row_radio_list_0", com.salampakistan.R.layout.row_radio_list);
      sKeys.put("layout/row_related_event_0", com.salampakistan.R.layout.row_related_event);
      sKeys.put("layout/row_related_location_0", com.salampakistan.R.layout.row_related_location);
      sKeys.put("layout/row_review_0", com.salampakistan.R.layout.row_review);
      sKeys.put("layout/row_room_photo_0", com.salampakistan.R.layout.row_room_photo);
      sKeys.put("layout/row_season_festivity_0", com.salampakistan.R.layout.row_season_festivity);
      sKeys.put("layout/row_services_0", com.salampakistan.R.layout.row_services);
      sKeys.put("layout/row_what_to_do_0", com.salampakistan.R.layout.row_what_to_do);
      sKeys.put("layout/row_where_to_go_0", com.salampakistan.R.layout.row_where_to_go);
      sKeys.put("layout/row_where_to_go_type_all_0", com.salampakistan.R.layout.row_where_to_go_type_all);
      sKeys.put("layout/row_wishlist_0", com.salampakistan.R.layout.row_wishlist);
      sKeys.put("layout/row_wishlist_skeleton_0", com.salampakistan.R.layout.row_wishlist_skeleton);
      sKeys.put("layout/sort_bottom_sheet_0", com.salampakistan.R.layout.sort_bottom_sheet);
      sKeys.put("layout/update_password_fragment_0", com.salampakistan.R.layout.update_password_fragment);
      sKeys.put("layout/view_back_btn_0", com.salampakistan.R.layout.view_back_btn);
      sKeys.put("layout/view_back_btn_black_0", com.salampakistan.R.layout.view_back_btn_black);
      sKeys.put("layout/view_counter_widget_0", com.salampakistan.R.layout.view_counter_widget);
      sKeys.put("layout/view_home_fragment_container_0", com.salampakistan.R.layout.view_home_fragment_container);
      sKeys.put("layout/view_profile_option_0", com.salampakistan.R.layout.view_profile_option);
      sKeys.put("layout/view_rating_bar_0", com.salampakistan.R.layout.view_rating_bar);
      sKeys.put("layout/view_search_toolbar_0", com.salampakistan.R.layout.view_search_toolbar);
      sKeys.put("layout/x1_0", com.salampakistan.R.layout.x1);
    }
  }
}
