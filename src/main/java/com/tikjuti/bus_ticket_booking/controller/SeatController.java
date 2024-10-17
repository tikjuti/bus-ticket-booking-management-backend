package com.tikjuti.bus_ticket_booking.controller;

import com.tikjuti.bus_ticket_booking.dto.request.Seat.SeatUpdateRequest;
import com.tikjuti.bus_ticket_booking.dto.response.ApiResponse;
import com.tikjuti.bus_ticket_booking.dto.response.SeatResponse;
import com.tikjuti.bus_ticket_booking.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @PutMapping("/{seatId}")
    ResponseEntity<ApiResponse<SeatResponse>> updateSeat(@PathVariable String seatId,
                                                         @RequestBody SeatUpdateRequest request)
    {
        ApiResponse<SeatResponse> apiResponse = new ApiResponse<>();

        apiResponse.setMessage("Seat update successfully");
        apiResponse.setCode(HttpStatus.OK.value());
        apiResponse.setResult(seatService.updateSeat(request, seatId));

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @PatchMapping("/{seatId}")
    ResponseEntity<ApiResponse<SeatResponse>> updatePatchSeat(@PathVariable String seatId,
                                                              @RequestBody SeatUpdateRequest request)
    {
        ApiResponse<SeatResponse> apiResponse = new ApiResponse<>();

        apiResponse.setMessage("Seat update successfully");
        apiResponse.setCode(HttpStatus.OK.value());
        apiResponse.setResult(seatService.patchUpdateSeat(request, seatId));

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
