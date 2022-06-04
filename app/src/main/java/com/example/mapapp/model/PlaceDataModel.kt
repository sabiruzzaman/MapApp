import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class PlaceDataModel {
    @SerializedName("places")
    @Expose
    private var places: List<Place?>? = null

    fun getPlaces(): List<Place?>? {
        return places
    }

    fun setPlaces(places: List<Place?>?) {
        this.places = places
    }

    public class Place() {
        @SerializedName("id")
        @Expose
        private var id: Int? = null

        @SerializedName("name")
        @Expose
        private var name: String? = null

        @SerializedName("distance_in_meters")
        @Expose
        private var distanceInMeters: Double? = null

        @SerializedName("longitude")
        @Expose
        private var longitude: Double? = null

        @SerializedName("latitude")
        @Expose
        private var latitude: Double? = null

        @SerializedName("Address")
        @Expose
        private var address: String? = null

        @SerializedName("city")
        @Expose
        private var city: String? = null

        @SerializedName("area")
        @Expose
        private var area: String? = null

        @SerializedName("pType")
        @Expose
        private var pType: String? = null

        @SerializedName("subType")
        @Expose
        private var subType: String? = null

        @SerializedName("uCode")
        @Expose
        private var uCode: String? = null

        @SerializedName("contact_person_phone")
        @Expose
        private var contactPersonPhone: Any? = null

        @SerializedName("ST_AsText(location)")
        @Expose
        private var sTAsTextLocation: String? = null

        fun getId(): Int? {
            return id
        }

        fun setId(id: Int?) {
            this.id = id
        }

        fun getName(): String? {
            return name
        }

        fun setName(name: String?) {
            this.name = name
        }

        fun getDistanceInMeters(): Double? {
            return distanceInMeters
        }

        fun setDistanceInMeters(distanceInMeters: Double?) {
            this.distanceInMeters = distanceInMeters
        }

        fun getLongitude(): Double? {
            return longitude
        }

        fun setLongitude(longitude: Double?) {
            this.longitude = longitude
        }

        fun getLatitude(): Double? {
            return latitude
        }

        fun setLatitude(latitude: Double?) {
            this.latitude = latitude
        }

        fun getAddress(): String? {
            return address
        }

        fun setAddress(address: String?) {
            this.address = address
        }

        fun getCity(): String? {
            return city
        }

        fun setCity(city: String?) {
            this.city = city
        }

        fun getArea(): String? {
            return area
        }

        fun setArea(area: String?) {
            this.area = area
        }

        fun getpType(): String? {
            return pType
        }

        fun setpType(pType: String?) {
            this.pType = pType
        }

        fun getSubType(): String? {
            return subType
        }

        fun setSubType(subType: String?) {
            this.subType = subType
        }

        fun getuCode(): String? {
            return uCode
        }

        fun setuCode(uCode: String?) {
            this.uCode = uCode
        }

        fun getContactPersonPhone(): Any? {
            return contactPersonPhone
        }

        fun setContactPersonPhone(contactPersonPhone: Any?) {
            this.contactPersonPhone = contactPersonPhone
        }

        fun getSTAsTextLocation(): String? {
            return sTAsTextLocation
        }

        fun setSTAsTextLocation(sTAsTextLocation: String?) {
            this.sTAsTextLocation = sTAsTextLocation
        }
    }

}

